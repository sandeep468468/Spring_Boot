package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CourseApiApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext ct =  SpringApplication.run(CourseApiApp.class, args);
    }

}
