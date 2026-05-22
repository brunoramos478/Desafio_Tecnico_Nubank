package com.desafio.nubank.model.repository.postgresql;

import com.desafio.nubank.application.dto.ContactDto;
import com.desafio.nubank.model.postgresql.Client;
import com.desafio.nubank.model.postgresql.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    Optional<Contact> findById(Long id);

    List<ContactDto> findAllByClient(Client client);
}
