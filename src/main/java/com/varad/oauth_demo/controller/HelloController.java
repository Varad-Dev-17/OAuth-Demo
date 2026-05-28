package com.varad.oauth_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

//    @GetMapping("/hello")
//    public String HelloController() {
//        return "Hello Varad you are logged in with oauth demo";
//    }
@GetMapping("/")
public String home(){
    return "Home Page";
}

//    @GetMapping("/hello")
//    public String hello(@AuthenticationPrincipal OAuth2User user){
//
//        String name = user.getAttribute("name");
//        String email = user.getAttribute("email");
//
//        return "Hello " + name + " " + email;
//    }

    @GetMapping("/hello")
    public String hello(@AuthenticationPrincipal OAuth2User user){

        System.out.println(user.getAttributes());
        log.info("user attributes: "+user.getAttributes());

        String name = user.getAttribute("name");

        if(name == null){
            name = user.getAttribute("login");
        }

        String email = user.getAttribute("email");

        return "Hello " + name + " " + email;
    }
}
