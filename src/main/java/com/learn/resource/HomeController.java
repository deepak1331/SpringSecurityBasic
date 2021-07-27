package com.learn.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/rest/home")
public class HomeController {
	
	/***
	 * Default username : user
	 * Default password: can be found in the console when the app boots up
	 * Using generated security password: 1574ad96-eb1e-4f9d-aa92-3cbf123b9e14
	 * @return
	 */
	@GetMapping("/")
	public String getAll() {
		return "<h1> Welcome </h1>";
	}

}
