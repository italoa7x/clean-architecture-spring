package com.br.codechella.domain.entities.usuario;

import java.time.LocalDate;

import com.br.codechella.domain.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 11, unique = true)
    private String cpf;

    private LocalDate birth;

    @Column(nullable = false, unique = true)
    private String email;

    private Address address;

    public User(String name, String cpf, LocalDate birth, String email, Address address) {
        String cpfRegex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (cpf == null || !cpf.matches(cpfRegex)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.name = name;
        this.cpf = cpf;
        this.birth = birth;
        this.email = email;
        this.address = address;
    }

}
