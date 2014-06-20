package com.sjm.myapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/welcome")
public class NameServiceController {
	
	@RequestMapping(value="/{name}",method = RequestMethod.GET) 
	public String getName(@PathVariable String name) {
		String result="Welcome "+name;
		return result;
	}
	
}
