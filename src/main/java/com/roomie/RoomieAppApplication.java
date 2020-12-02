package com.roomie;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

//	@GetMapping("/PotentialMatches")
//	public String potentialMatches(){
//		return "PotentialMatches";
//	}

//	@GetMapping("/SearchByLocation")
//	public String searchLocation(){
//		return "SearchLocation";
//	}

//	@GetMapping("/SearchNewMembers")
//	public String searchNewMembers(){
//		return "SearchNewMember";
//	}

//	@GetMapping("/SearchOnline")
//	public String searchOnline(){
//		return "SearchOnline";
//	}

//	@GetMapping("/SearchRecommended")
//	public String searchRecommended(){
//		return "SearchRecommended";
////	}
//
//	@GetMapping("/UserProfile")
//	public String userProfile(){
//		return "UpdateUserProfile";
//	}

//	@GetMapping("/UserHomePage")
//	public String userHomePage(){
//		return "UserHomePage";
//	}




}
