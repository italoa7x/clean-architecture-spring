package com.br.codechella.domain.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.codechella.domain.entities.usuario.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
