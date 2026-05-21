package com.desafio.nubank.infra.exception;

public class UserExists extends RuntimeException {

    public UserExists() {
        super("Usuário já cadastrado");
    }

    public UserExists(String message) {
        super(message);
    }

}
