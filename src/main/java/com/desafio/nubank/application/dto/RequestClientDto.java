package com.desafio.nubank.application.dto;

import jakarta.validation.constraints.NotBlank;

public record RequestClientDto(
        @NotBlank
        String name,

        @NotBlank
        String cpf
) {
}
