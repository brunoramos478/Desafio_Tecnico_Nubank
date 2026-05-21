package com.desafio.nubank.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RequestContactDto(
        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telephone
) {
}
