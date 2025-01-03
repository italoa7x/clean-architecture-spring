package com.br.codechella.domain.entities.usuario;

import java.time.LocalDate;

import com.br.codechella.domain.Address;

public class UserFactory {
    private User user;

    public User withNameCpfBirth(String name, String cpf, LocalDate birth, Address address) {
        this.user = new User(name, cpf, birth, "", null);
        return this.user;
    }

    public User addAddress(String cep, String place, Integer number, String complement) {
        this.user.setAddress(new Address(cep, place, number, complement));
        return this.user;
    }
}
