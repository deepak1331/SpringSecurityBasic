package com.learn.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/rest/home")
public class HomeController {
	
	/***
	 * Default username : user
	 * Default password: can be found in the console when the app boots up
	 * Using generated security password: <new password will be created on every run>
	 * 
	 * Or we can also add spring.security.user.name and  spring.security.user.password 
	 * in the application.properties file and give some values to override spring
	 * default password
	 * @return
	 */
	@GetMapping("/")
	public String getAll() {
		return "<h1> Welcome </h1>";
	}

}
