package com.desafio.nubank.model.repository;

import com.desafio.nubank.model.postgresql.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    boolean existsClientByCpf(String cpf);
}
