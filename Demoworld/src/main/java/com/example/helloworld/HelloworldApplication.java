package com.example.helloworld;

import org.springframework.boot.SpringApplication;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	
	
}
@RestController
@RequestMapping(path="/")
class DemoController{
@RequestMapping(value="print/{msg}")
public String print(@PathVariable(value="") String msg){
return "Hello"+"" + msg;
}
}

