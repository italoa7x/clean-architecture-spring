package com.br.codechella.domain.infra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.codechella.application.usecases.UserService;
import com.br.codechella.domain.entities.dto.UserInputDto;
import com.br.codechella.domain.entities.usuario.User;

@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(this.userService.findAll());
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody @Validated UserInputDto user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.save(user));
    }
}
