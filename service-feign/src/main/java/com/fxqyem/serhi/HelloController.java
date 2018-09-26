package com.fxqyem.serhi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String sayHello(){
		return helloService.sayHello();
	}
	
}
