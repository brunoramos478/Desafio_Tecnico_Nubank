package com.desafio.nubank.application.service;

import com.desafio.nubank.application.dto.ClientDto;
import com.desafio.nubank.application.dto.ContactDto;
import com.desafio.nubank.application.dto.RequestClientDto;
import com.desafio.nubank.application.dto.RequestContactDto;
import com.desafio.nubank.application.mapper.postgresql.ClientMapper;
import com.desafio.nubank.application.mapper.postgresql.ContactMapper;
import com.desafio.nubank.application.mapper.postgresql.DtoClientMapper;
import com.desafio.nubank.application.mapper.postgresql.DtoContactMapper;
import com.desafio.nubank.infra.exception.UserExists;
import com.desafio.nubank.infra.exception.UserNotFound;
import com.desafio.nubank.model.postgresql.Client;
import com.desafio.nubank.model.postgresql.Contact;
import com.desafio.nubank.model.repository.postgresql.ClientRepository;
import com.desafio.nubank.model.repository.postgresql.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

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
        contact.setClient(client);

        contactRepository.save(contact);
    }

    @Transactional
    public List<ClientDto> allClients() {
        List<Client> clients = clientRepository.findAll();

        return DtoClientMapper.mapping.toDtoList(clients);
    }


    @Transactional
    public List<ContactDto> allContactOfClient(Long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new UserNotFound());

         return DtoContactMapper.mapping.toDtoList(client.getContacts());

    }
}
