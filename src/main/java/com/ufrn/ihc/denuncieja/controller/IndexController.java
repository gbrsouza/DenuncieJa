package com.ufrn.ihc.denuncieja.controller;

import com.ufrn.ihc.denuncieja.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class IndexController {

    private final UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/cadastro")
    public String singUp(){
        return "signUpUser";
    }

    @GetMapping("/cadastro/inst")
    public String singUpInst(){
        return "signUpInst";
    }

    @GetMapping("/user")
    public String instDash() {return "inicialInst";}

    @GetMapping("/user/denuncias")
    public String denuncias() {return "denuncias";}

    @GetMapping("/view")
    public String initialUser() {return "inicialUser";}

    @GetMapping("/view/denunciar")
    public String denunciar() {return "denunciarCaso";}

    @GetMapping("/view/default")
    public String defaults() {return "viewDenuncia";}

    @GetMapping("/view/default/user")
    public String defaultsuser() {return "viewDenunciaUser";}

}
