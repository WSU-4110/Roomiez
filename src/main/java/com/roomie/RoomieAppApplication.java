package com.roomie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.*;

@SpringBootApplication
@Controller
public class RoomieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomieAppApplication.class, args);
	}

	@GetMapping("/home")
	public String homePage(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "HomePage";
	}

//	@GetMapping("/Registration")
//	public String registration(){
//		return "Registration";
//	}

//	@GetMapping("/LogIn")
//	public String logIn(){
//		return "LogIn";
//	}

	@GetMapping("/RoomiezMatches")
	public String potentialMatches(){
		return "PotentialMatches";
	}

//	@GetMapping("/SearchByLocation")
//	public String searchLocation(){
//		return "SearchLocation";
//	}

//	@GetMapping("/SearchNewMembers")
//	public String searchNewMembers(){
//		return "SearchNewMember";
//	}

	@GetMapping("/SearchOnline")
	public String searchOnline(){
		return "SearchOnline";
	}

	@GetMapping("/SearchRecommended")
	public String searchRecommended(){
		return "SearchRecommended";
	}

	@GetMapping("/UserProfile")
	public String userProfile(){
		return "UserProfile";
	}

	@GetMapping("/UserHomePage")
	public String userHomePage(){
		return "UserHomePage";
	}




}
