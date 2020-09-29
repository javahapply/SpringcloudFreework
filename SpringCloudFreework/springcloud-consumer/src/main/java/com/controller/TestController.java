package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.UserClientService;
import com.vo.Users;


@RestController
@RequestMapping("test")
public class TestController {

	/*基于restTemplate 来实现调用
	 * 
	 */
	/*@Autowired
	private RestTemplate restTemplate;

	@Value("${helloService.servicePath}")
	private String serverPath;

	@RequestMapping("/hello/{word}")
	public String hello(@PathVariable("word")String word) {
		return restTemplate.getForObject(serverPath+word, String.class);
	}*/


	@Autowired
	public UserClientService clientService;

	@GetMapping("/queryalluser")
	public String QueryUsers() {
		
		String queryUsers = clientService.QueryUsers();
		return queryUsers;
	}

	@GetMapping("/userbyid")
	public Users UsersByid(int userid) {
		Users usersbyid = clientService.Usersbyid(userid);
		return usersbyid;
	}

	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return clientService.hello(name);
	}
}
