package com.desafio.nubank.infra.exception;

public class UserNotFound extends RuntimeException {

    public UserNotFound(){
        super("Usuário não encontrado");
    }

    public UserNotFound(String message){
        super(message);
    }

}
