package com.ufrn.ihc.denuncieja.repository;

import com.ufrn.ihc.denuncieja.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
    public ApplicationUser findByEmail(String email);
}
