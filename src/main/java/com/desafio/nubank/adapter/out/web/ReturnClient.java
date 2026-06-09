package com.desafio.nubank.adapter.out.web;

import com.desafio.nubank.application.dto.ClientDto;
import com.desafio.nubank.application.dto.ContactDto;
import com.desafio.nubank.application.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ReturnClient {

    private final ApplicationService service;

    @GetMapping()
    public ResponseEntity<List<ClientDto>> getAllClients() {

        List<ClientDto> clients = service.allClients();
        return ResponseEntity.status(HttpStatus.OK).body(clients);
    }

    @GetMapping("/{id}/contatos")
    public ResponseEntity<List<ContactDto>> getAllContactsOfClient(@PathVariable Long id) {
        List<ContactDto> contacts = service.allContactOfClient(id);

        return ResponseEntity.status(HttpStatus.OK).body(contacts);
    }
}
