package com.fxqyem.bootDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="demo")
public class DemoController {
	@Value("${server.port}")
	private String port;
	@Value("${mconfig.message}")
	private String message;
	
	@RequestMapping(value="getMsg")
	@ResponseBody
	public String getMsg(){
		System.out.println("DemoController getMsg......");
		return message+" "+port;
	}
	
}
