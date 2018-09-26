package com.fxqyem.serhi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hi")
public interface HelloService {
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHello();
	
}
