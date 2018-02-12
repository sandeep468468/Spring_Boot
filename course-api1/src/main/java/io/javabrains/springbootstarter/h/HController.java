package io.javabrains.springbootstarter.h;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HController 
{
 
	   @RequestMapping("/hello")
		public String sayHi()
		{
			return "Hi Spring Boot";
		}
	   
	   @RequestMapping("/topics1")
		public String getAllTopics()
		{
			return "All topics";
		}

}
