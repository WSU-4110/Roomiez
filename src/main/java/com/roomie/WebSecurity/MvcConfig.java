package com.roomie.WebSecurity;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

   public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/home").setViewName("HomePage");
//        registry.addViewController("/").setViewName("home");
        registry.addViewController("/surveyResults").setViewName("UserHomePage");
        registry.addViewController("/UserHomePage").setViewName("PotentialMatches");
//        registry.addViewController("/login").setViewName("LogIn");
        registry.addViewController("/PotentialMatches").setViewName("PotentialMatches");
        registry.addViewController("/surveyForm").setViewName("UpdateUserProfile");
        registry.addViewController("/ChatHomePage").setViewName("ChatHomePage");
        registry.addViewController("/Settings").setViewName("Settings");
        registry.addViewController("/SearchOnline").setViewName("SearchOnline");
        registry.addViewController("/SearchRecommended").setViewName("SearchRecommended");
        registry.addViewController("/UpdateUserProfile").setViewName("UpdateUserProfile");
        registry.addViewController("/UserProfile").setViewName("UserProfile");


   }

}
