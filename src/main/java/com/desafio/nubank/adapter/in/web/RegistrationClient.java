package com.desafio.nubank.adapter.in.web;

import com.desafio.nubank.application.dto.RequestClientDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class RegistrationClient {

    @PostMapping()
    public ResponseEntity<Void> createClient(@Valid @RequestBody RequestClientDto clientDto) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
