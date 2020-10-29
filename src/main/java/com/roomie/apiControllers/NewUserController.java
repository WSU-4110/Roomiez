//package com.roomie.apiControllers;
//
//import com.roomie.converters.NewUserToNewUserForm;
//import com.roomie.model.NewUser;
//import com.roomie.model.NewUserForm;
//import com.roomie.service.NewUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
////import javax.validation.Valid;
//
//@Controller
//@RequestMapping("/Registration")
//public class NewUserController  {
//
//    @Autowired
//    private NewUserService newUserService;
//
//    @Autowired
//    private NewUserToNewUserForm newUserToNewUserForm;
//
//    @Autowired
//    public void setNewUserToNewUserForm(NewUserToNewUserForm newUserToNewUserForm){
//        this.newUserToNewUserForm = newUserToNewUserForm;
//    }
//
//    @Autowired
//    public void setNewUserService(NewUserService newUserService){
//        this.newUserService = newUserService;
//    }
//
//
//    @RequestMapping(path="/Registration")
//    public String newUser(Model model){
//        model.addAttribute("newUserForm", new NewUserForm());
//        return "/logIn";
//    }
//
//
//    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
//    public String saveOrUpdateUser(NewUserForm newUserForm, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            return "Registration";
//        }
//        NewUser savedNewUser = newUserService.saveOrUpdateNewUserForm(newUserForm);
//
//        return "logIn";
//    }
//
//}