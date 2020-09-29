package com.controller;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest2/at2/hybris/customers")
public class GatewayApiController {

	@PostMapping(value = "/current/login")
	public String  login(@RequestParam("password") String password, @RequestParam("userName") String userName,HttpServletResponse response) {
//		log.info("CustomersController.login()");
		
		return "{   \r\n" + 
				"			 \"state\": \"success\",\r\n" + 
				"			 \"details\": \"灰度调用成功\",\r\n" + 
				"			 \"code\": \"200\"\r\n" + 
				"			}";
			
	}
	
}
