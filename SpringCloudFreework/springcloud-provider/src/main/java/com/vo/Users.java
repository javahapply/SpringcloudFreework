package com.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Users implements Serializable {
	private Integer userid;
	private String loginname;
	private String loginpwd;
	private String realname;
	private String sax;
	private String age;
}
