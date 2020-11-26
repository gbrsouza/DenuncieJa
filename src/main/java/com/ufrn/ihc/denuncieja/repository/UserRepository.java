package com.ufrn.ihc.denuncieja.repository;

import com.ufrn.ihc.denuncieja.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
