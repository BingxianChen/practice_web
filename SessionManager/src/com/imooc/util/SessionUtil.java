package com.imooc.util;

import java.util.ArrayList;

import com.imooc.entity.User;

public class SessionUtil {
	
	public static Object getUserBySessionId(ArrayList<User> userList,String sessionIdString) {
		for (User user : userList) {
			if(user.getSessionIdString().equals(sessionIdString)){
				return user;
			}
		}
		return null;
	}

}
