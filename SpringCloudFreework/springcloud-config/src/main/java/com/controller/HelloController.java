package com.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger( HelloController.class );

    @Value( "${server.port}" )
    String port;

    @GetMapping("hi")
    @ResponseBody
    public void hi(String name) {

        System.out.println(name + "端口：" +port);

    }

}
