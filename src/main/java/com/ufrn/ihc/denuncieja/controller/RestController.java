package com.ufrn.ihc.denuncieja.controller;


import com.ufrn.ihc.denuncieja.model.Denuncia;
import com.ufrn.ihc.denuncieja.service.DenunciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RestController {
    private final DenunciaService denunciaService;
    @GetMapping("/list/denuncias")
    public List<Denuncia> listDenuncia(){ return denunciaService.listAll();}
}
