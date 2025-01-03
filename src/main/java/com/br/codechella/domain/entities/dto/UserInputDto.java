package com.br.codechella.domain.entities.dto;

import java.time.LocalDate;

import com.br.codechella.domain.Address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInputDto {
    private Integer id;

    private String name;

    private String cpf;

    private LocalDate birth;

    private String email;

    private Address address;

}
