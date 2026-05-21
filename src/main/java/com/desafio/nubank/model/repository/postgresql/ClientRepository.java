package com.desafio.nubank.model.repository.postgresql;

import com.desafio.nubank.model.postgresql.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    boolean existsClientByCpf(String cpf);
}
