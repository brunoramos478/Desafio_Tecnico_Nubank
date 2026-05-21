package com.desafio.nubank.application.service;

import com.desafio.nubank.application.dto.RequestClientDto;
import com.desafio.nubank.application.dto.RequestContactDto;
import com.desafio.nubank.application.mapper.postgresql.ClientMapper;
import com.desafio.nubank.application.mapper.postgresql.ContactMapper;
import com.desafio.nubank.infra.exception.UserExists;
import com.desafio.nubank.infra.exception.UserNotFound;
import com.desafio.nubank.model.postgresql.Client;
import com.desafio.nubank.model.postgresql.Contact;
import com.desafio.nubank.model.repository.postgresql.ClientRepository;
import com.desafio.nubank.model.repository.postgresql.ContactRepository;
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
            throw new UserExists();
        }

        Client client = ClientMapper.mapping.user(clientDto);

        clientRepository.save(client);
    }

    @Transactional
    public void saveContact(RequestContactDto contactDto, Long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new UserNotFound());

        Contact contact = ContactMapper.mapping.contactUser(contactDto);

        contactRepository.save(contact);
    }
}
