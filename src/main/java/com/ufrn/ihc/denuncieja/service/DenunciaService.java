package com.ufrn.ihc.denuncieja.service;

import com.ufrn.ihc.denuncieja.model.Denuncia;
import com.ufrn.ihc.denuncieja.repository.DenunciaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DenunciaService {
    private final DenunciaRepository denunciaRepository;
    public void save(Denuncia denuncia){
        denunciaRepository.save(denuncia);
    }

    public List<Denuncia> listAll(){
        return denunciaRepository.findAll();
    }
}
