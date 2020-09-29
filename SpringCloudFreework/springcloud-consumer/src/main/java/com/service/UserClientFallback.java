package com.service;

import org.springframework.stereotype.Component;

import com.vo.Users;

/**
 * 统一处理熔断
 * @author asw
 *
 */

@Component
public class UserClientFallback implements UserClientService {

	@Override
	public String QueryUsers() {		
		return null;
	}

	@Override
	public Users Usersbyid(int userid) {
		Users users =new Users();
		users.setUserid(userid);
		users.setLoginname("未找到该ID查询的信息");
		users.setLoginpwd("未找到该ID查询的信息");
		System.out.println("熔断，默认回调函数");
/*        return "{\"username\":\"admin\",\"age\":\"-1\"}";*/
		return users;
	}

	@Override
	public String hello(String name) {
		return null;
	}

}
