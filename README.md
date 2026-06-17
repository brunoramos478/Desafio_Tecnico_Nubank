# Desafio Backend Nubank

## Nesse repositório, apresento minha solução do desafio técnico elaborado pela equipe Nubank, que foi proposto elaborar uma API REST para o gerenciamento de clientes e seus respectivos contatos, os quais poderiam conter 0 ou inúmeros contatos.


## Tecnologias Utilizadas

*   Java 25
*   Spring Boot 4.0.6
*   Maven
*   PostgreSQL
*   Lombok
*   MapStruct

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/brunoramos478/Desafio_Tecnico_Nubank.git
    ```
2.  **Configure o banco de dados:**
    *   Crie um banco de dados PostgreSQL.
    *   Atualize as configurações de conexão no arquivo `application.properties`.
3.  **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

A API estará disponível em `http://localhost:8080` ou a que você definir no `application.properties`.
