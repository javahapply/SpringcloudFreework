package com.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vo.Users;


											
@FeignClient(value="HELLOSERVER" ,fallback=UserClientFallback.class)
public interface UserClientService {
	
	@RequestMapping(value="/user/queryalluser")
	public String QueryUsers();
		
	
	@RequestMapping("/user/userbyid")
	public Users Usersbyid(int userid);
	
	@RequestMapping(value = "/user/hello")
    String hello(@RequestParam(value = "name") String name);
	
}
