package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UsersDao;
import com.service.UsersService;
import com.vo.Users;


@Service
public class UsersServiceimpl implements UsersService {

	@Autowired
	private UsersDao userdao;
	
	@Override
	public List<Users> QueryUsers() {
		// TODO Auto-generated method stub
		return userdao.QueryUsers();
	}

	@Override
	public Users Usersbyid(int userid) {
		// TODO Auto-generated method stub
		return userdao.Usersbyid(userid);
	}

}
