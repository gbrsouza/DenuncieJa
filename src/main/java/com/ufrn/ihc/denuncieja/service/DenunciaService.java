package com.ufrn.ihc.denuncieja.service;

import com.ufrn.ihc.denuncieja.model.Denuncia;
import com.ufrn.ihc.denuncieja.repository.DenunciaRepository;
import com.ufrn.ihc.denuncieja.util.StatusEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Denuncia> listById(){
        long id = 1;
        return denunciaRepository.findById(id);
    }

    public void updateDenuncia(StatusEnum statusEnum){
        long id = 1;
        Denuncia denuncia = denunciaRepository.findById(id).get();
        denuncia.setStatus(statusEnum);
        denunciaRepository.save(denuncia);
    }

}
