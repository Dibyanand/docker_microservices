/**
 * 
 */
package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ddibyana
 *
 */
@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String getHello()
	{
		return "Hello from Spring Boot";
	}

}
