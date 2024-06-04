package com.deeeler.cicd.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdActionsApplication {

	@GetMapping("/")
	public String SayHi(){
		return "Yassine Dlimi";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdActionsApplication.class, args);
	}

}
