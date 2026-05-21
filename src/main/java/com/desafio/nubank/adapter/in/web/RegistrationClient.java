package com.desafio.nubank.adapter.in.web;

import com.desafio.nubank.application.dto.RequestClientDto;
import com.desafio.nubank.application.service.ApplicationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class RegistrationClient {

    private final ApplicationService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> createClient(@Valid @RequestBody RequestClientDto clientDto) {
        service.saveClient(clientDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
