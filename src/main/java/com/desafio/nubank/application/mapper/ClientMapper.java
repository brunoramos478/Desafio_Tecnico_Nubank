package com.desafio.nubank.application.mapper;

import com.desafio.nubank.application.dto.RequestClientDto;
import com.desafio.nubank.model.postgresql.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientMapper mapping = Mappers.getMapper(ClientMapper.class);

    RequestClientDto requestDto(Client client);


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "contatos", ignore = true)
    Client user(RequestClientDto requestClientDto);

}
