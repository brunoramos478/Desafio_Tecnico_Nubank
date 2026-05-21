package com.desafio.nubank.model.repository;

import com.desafio.nubank.model.postgresql.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    Optional<Contact> findById(Long id);
}
