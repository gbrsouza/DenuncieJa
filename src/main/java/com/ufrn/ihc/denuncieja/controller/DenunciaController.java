package com.ufrn.ihc.denuncieja.controller;

import com.ufrn.ihc.denuncieja.model.Denuncia;
import com.ufrn.ihc.denuncieja.service.DenunciaService;
import com.ufrn.ihc.denuncieja.util.ResponseDenuncia;
import com.ufrn.ihc.denuncieja.util.StatusEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DenunciaController {
    private final DenunciaService denunciaService;

    @GetMapping("/user/denunciar")
    public String denunciar() {return "denunciarCaso";}

    @GetMapping("/view/inst/denuncia")
    public ModelAndView defaults() {
        ModelAndView mv = new ModelAndView("viewDenuncia");
        Denuncia denuncia = denunciaService.listById().get();
        mv.addObject("denuncia", denuncia);
        return mv;
    }

    @GetMapping("/view/user/denuncia")
    public ModelAndView defaultsuser() {
        ModelAndView mv = new ModelAndView("viewDenunciaUser");
        Denuncia denuncia = denunciaService.listById().get();
        mv.addObject("denuncia", denuncia);
        return mv;
    }

    @GetMapping("/inst/denuncias")
    public ModelAndView denuncias() {
        ModelAndView mv = new ModelAndView("denuncias");
        Iterable<Denuncia> denuncias = denunciaService.listAll();
        mv.addObject("denuncias", denuncias);
        return mv;
    }

    @PostMapping("/user/denunciar")
    public String saveDenuncia(Denuncia denuncia) {
        denunciaService.save(denuncia);
        return "redirect:/user";
    }

    @PostMapping("/inst/response")
    public String responseDenuncia(ResponseDenuncia responseDenuncia) {
        denunciaService.updateDenuncia(StatusEnum.EM_ANDAMENTO);
        return "redirect:/inst/denuncias";
    }

}
