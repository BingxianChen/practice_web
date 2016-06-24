package com.imooc.entity;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class User implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable{
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("valueBound Name:" + arg0.getName());
	}

	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("valueUnbound Name:" + arg0.getName());

	}
	//活化
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("sessionDidActivate:" + arg0.getSource());
	}
	//钝化
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("sessionWillPassivate:" + arg0.getSource());
	}

}














