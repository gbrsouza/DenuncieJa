package com.ufrn.ihc.denuncieja.controller;

import com.ufrn.ihc.denuncieja.model.Denuncia;
import com.ufrn.ihc.denuncieja.service.DenunciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DenunciaController {
    private final DenunciaService denunciaService;

    @GetMapping("/user/denunciar")
    public String denunciar() {return "denunciarCaso";}

    @GetMapping("/view/inst/denuncia")
    public String defaults() {return "viewDenuncia";}

    @GetMapping("/view/user/denuncia")
    public String defaultsuser() {return "viewDenunciaUser";}

    @GetMapping("/inst/denuncias")
    public String denuncias() {return "denuncias";}

    @PostMapping("/user/denunciar")
    public String saveDenuncia(Denuncia denuncia) {
        denunciaService.save(denuncia);
        return "redirect:/user";
    }

}
