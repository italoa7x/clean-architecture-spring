package com.br.codechella.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.br.codechella.domain.entities.usuario.User;
import com.br.codechella.domain.entities.usuario.UserFactory;

public class UserTest {

    @Test
    public void testaErroAoCriarUsuarioComCpfInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new User("User 1", "355.098.210-0", LocalDate.parse("1998-02-24"), "user1@gmail.com", null);
        });
    }

    @Test
    public void deveCriarUsuarioUsandoUserFactory() {
        UserFactory userFactory = new UserFactory();

        User user = userFactory.withNameCpfBirth("User 1", "654.123.897-88", LocalDate.parse("1998-02-24"), null);

        assertEquals(user.getName(), "User 1");

        userFactory.addAddress("58500000", "Rua teste", 20, "casa azul");

        assertEquals("Rua teste", user.getAddress().getPlace());

    }
}
