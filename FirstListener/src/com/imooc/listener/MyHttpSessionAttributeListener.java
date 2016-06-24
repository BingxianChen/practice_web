package com.imooc.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class MyHttpSessionAttributeListener
 *
 */
@WebListener
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public MyHttpSessionAttributeListener() {
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	System.out.println("HttpSession_attributeRemoved:" + arg0.getName());
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    	System.out.println("HttpSession_attributeAdded:" + arg0.getName());

    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    	System.out.println("HttpSession_attributeReplaced:" + arg0.getName());

    }
	
}
