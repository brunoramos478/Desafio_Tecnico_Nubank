package com.desafio.nubank.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequestContactDto(
        @NotBlank(message = "Campo 'name' é obrigatório")
        @Size(min = 3, max = 50, message = "Campo 'name' deve conter entre 3 e 50 caracteres")
        String name,

        @NotBlank(message = "Campo 'email' é obrigatório")
        @Email(message = "Email inválido")
        @Size(max = 70, message = "Campo 'email' deve conter no máximo 70 caracteres")
        String email,

        @NotBlank(message = "Campo 'telefone' é obrigatório")
        @Size(min = 9, max  = 20, message = "Campo 'telefone' deve conter entre 9 e 20 caracteres")
        String telephone
) {
}
