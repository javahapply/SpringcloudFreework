package com.service;

import java.util.List;

import com.vo.Users;

public interface UsersService {
	
	public List<Users> QueryUsers();
	
	public Users Usersbyid(int userid);
}
