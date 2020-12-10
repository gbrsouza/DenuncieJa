package com.ufrn.ihc.denuncieja.controller;

import com.ufrn.ihc.denuncieja.model.Denuncia;
import com.ufrn.ihc.denuncieja.service.DenunciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ApplicationUserController {
    private final DenunciaService denunciaService;

    @GetMapping("/inst")
    public String instDash() {return "inicialInst";}

    @GetMapping("/user")
    public ModelAndView initialUser() {
        ModelAndView mv = new ModelAndView("inicialUser");
        Iterable<Denuncia> denuncias = denunciaService.listAll();
        mv.addObject("denuncias", denuncias);
        return mv;
    }


}
