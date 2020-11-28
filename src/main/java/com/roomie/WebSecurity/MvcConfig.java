package com.roomie.WebSecurity;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

   public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/home").setViewName("HomePage");
//        registry.addViewController("/").setViewName("home");
        registry.addViewController("/UserHomePage").setViewName("UserHomePage");
        registry.addViewController("/LogIn").setViewName("LogIn");
        registry.addViewController("/PotentialMatches").setViewName("PotentialMatches");
        registry.addViewController("/UpdateUserProfile").setViewName("UpdateUSerProfile");
        registry.addViewController("/ChatHomePage").setViewName("ChatHomePage");
        registry.addViewController("/Settings").setViewName("Settings");
        registry.addViewController("/SearchOnline").setViewName("SearchOnline");
        registry.addViewController("/SearchRecommended").setViewName("SearchRecommended");
        registry.addViewController("/UpdateUserProfile").setViewName("UpdateUserProfile");
        registry.addViewController("/HomeTour").setViewName("HomeTour");
        registry.addViewController("/UploadHomeTour").setViewName("UploadHomeTour");


   }

}
