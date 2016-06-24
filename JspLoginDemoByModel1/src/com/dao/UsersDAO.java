package com.dao;

import com.po.Users;

//业务逻辑类
public class UsersDAO {
	//用户登陆方法
	public boolean usersLogin(Users u){
		if("孙彦珺".equals(u.getUsername())&&"123456".equals(u.getPassword())){
			return true;
		}else{
			return false;
		}
	}
}
