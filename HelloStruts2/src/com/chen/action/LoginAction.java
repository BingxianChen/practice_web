package com.chen.action;

import com.chen.po.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public String login(){
		
		
		System.out.println(user.getUsername());
		System.out.println(user.getBookList().get(0));
		System.out.println(user.getBookList().get(1));

		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public void validate() {

		if(user.getUsername() == null
				||"".equals(user.getUsername().trim())){
			this.addFieldError("username", "用户名不能为空");
			//return INPUT;
		}
	}
	

}
