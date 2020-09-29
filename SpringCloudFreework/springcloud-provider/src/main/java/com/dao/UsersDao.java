package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vo.Users;

@Mapper
public interface UsersDao {
	public List<Users> QueryUsers();
	
	public Users Usersbyid(int userid);
	
}
