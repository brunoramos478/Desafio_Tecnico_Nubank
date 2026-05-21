package com.desafio.nubank.application.service;

import com.desafio.nubank.application.dto.RequestClientDto;
import com.desafio.nubank.application.dto.RequestContactDto;
import com.desafio.nubank.model.postgresql.Client;
import com.desafio.nubank.model.postgresql.Contact;
import com.desafio.nubank.model.repository.ClientRepository;
import com.desafio.nubank.model.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ApplicationService {

    private final ClientRepository clientRepository;
    private final ContactRepository contactRepository;

    @Transactional
    public void saveClient(RequestClientDto clientDto) {
        if (clientRepository.existsClientByCpf(clientDto.cpf())) {
            throw new IllegalArgumentException("Cliente já cadastrado com este CPF.");
        }

        Client client = new Client();
        client.setName(clientDto.name());
        client.setCpf(clientDto.cpf());
        clientRepository.save(client);
    }

    @Transactional
    public void saveContact(RequestContactDto contactDto, Long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado."));

        Contact contact = new Contact();
        contact.setName(contactDto.name());
        contact.setEmail(contactDto.email());
        contact.setTelephone(contactDto.telephone());
        contact.setClient(client);
        contactRepository.save(contact);
    }
}
