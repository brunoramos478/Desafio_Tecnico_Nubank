package com.desafio.nubank.application.dto;

import lombok.Builder;

@Builder
public record ContactDto(
        String name,
        String email,
        String telephone
) {
}
