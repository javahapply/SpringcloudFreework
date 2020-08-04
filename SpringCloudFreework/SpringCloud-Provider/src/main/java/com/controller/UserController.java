package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.UsersService;
import com.vo.Users;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UsersService usersService;

	@RequestMapping("/queryalluser")
	public List<Users> QueryUsers() {
		List<Users> queryUsers = usersService.QueryUsers();

		return queryUsers;
	}

	@RequestMapping("/userbyid")
	public Users UsersByid(int userid) {
		Users usersbyid = usersService.Usersbyid(userid);
		return usersbyid;
	} 

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return "这是服务提供者，参数："+name;
	}
	
}
