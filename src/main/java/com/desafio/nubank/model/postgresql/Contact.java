package com.desafio.nubank.model.postgresql;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name= "nome")
    private String name;

    @Column(name= "email")
    @Email
    private String email;

    @Column(name= "telefone")
    private String telephone;

    @ManyToOne
    private Client client;

}
