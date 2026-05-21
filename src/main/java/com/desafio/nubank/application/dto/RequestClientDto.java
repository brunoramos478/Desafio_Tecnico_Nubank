package com.desafio.nubank.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public record RequestClientDto(
        @NotBlank(message = "Campo 'name' é obrigatório")
        @Size(min = 3, max = 50, message = "Campo 'name' deve conter entre 3 e 50 caracteres")
        String name,

        @NotBlank(message = "Campo 'cpf' é obrigatório")
        @Size(min = 11, max = 14, message = "Campo 'cpf' deve conter 11 a 14 caracteres")
        @CPF(message = "CPF inválido")
        String cpf
) {
}
