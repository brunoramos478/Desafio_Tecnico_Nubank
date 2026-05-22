package com.desafio.nubank.application.dto;

import com.desafio.nubank.model.postgresql.Contact;
import lombok.Builder;
import java.util.List;

@Builder
public record ClientDto(
        String name,
        String cpf,
        List<ContactDto> contacts
) {

}
