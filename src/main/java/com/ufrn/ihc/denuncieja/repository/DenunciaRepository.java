package com.ufrn.ihc.denuncieja.repository;

import com.ufrn.ihc.denuncieja.model.Denuncia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DenunciaRepository extends JpaRepository<Denuncia, Long> {
}
