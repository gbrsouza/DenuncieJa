package com.ufrn.ihc.denuncieja.service;

import com.ufrn.ihc.denuncieja.model.ApplicationUser;
import com.ufrn.ihc.denuncieja.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final UserRepository userRepository;

    public ApplicationUser getByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
