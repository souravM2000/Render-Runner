package com.desicart.AppRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRunnerApplication.class, args);
	}

	@GetMapping("/index")
	public String index(){
		return "hi";
	}

}
