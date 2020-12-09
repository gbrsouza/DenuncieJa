package com.ufrn.ihc.denuncieja.controller;

import com.ufrn.ihc.denuncieja.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/cadastro-user")
    public String singUp(){
        return "signUpUser";
    }

    @GetMapping("/cadastro-inst")
    public String singUpInst(){
        return "signUpInst";
    }



}
