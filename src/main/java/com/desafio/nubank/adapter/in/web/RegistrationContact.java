package com.desafio.nubank.adapter.in.web;

import com.desafio.nubank.application.dto.RequestContactDto;
import com.desafio.nubank.application.service.ApplicationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes/{clientId}/contatos")
@RequiredArgsConstructor
public class RegistrationContact {
    private final ApplicationService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> createContact(@Valid @RequestBody RequestContactDto contactDto, @PathVariable Long clientId) {

        service.saveContact(contactDto, clientId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
