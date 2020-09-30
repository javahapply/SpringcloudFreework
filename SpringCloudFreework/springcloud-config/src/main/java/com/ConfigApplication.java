package com;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class ConfigApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
