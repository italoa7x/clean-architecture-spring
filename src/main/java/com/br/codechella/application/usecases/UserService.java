package com.br.codechella.application.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.codechella.domain.entities.usuario.User;
import com.br.codechella.domain.infra.persistence.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return this.userRepository.save(user);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
