package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {
	
	private FilterConfig config;
	

    /**
     * Default constructor. 
     */
    public LoginFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse respon = (HttpServletResponse)response;
		HttpSession session = req.getSession();
		
		String noLoginPaths = config.getInitParameter("noLoginPaths");
		
		String charset = config.getInitParameter("charset");
		if(charset==null){
			charset = "utf-8";
		}
		req.setCharacterEncoding(charset);
		if(noLoginPaths!=null){
			String[] strArray = noLoginPaths.split(";");
			for (String string : strArray) {
				if(string==null||"".equals(string))continue;
				if(req.getRequestURI().indexOf(string)!=-1){
					chain.doFilter(request, response);
					return;
				}
			}
		}
		
		
		if(session.getAttribute("username")!=null){
			chain.doFilter(request, response);
		}else{
			respon.sendRedirect("login.jsp");
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		config = fConfig;
	}

}
