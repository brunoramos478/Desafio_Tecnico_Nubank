package com.desafio.nubank.application.mapper.postgresql;

import com.desafio.nubank.application.dto.ClientDto;
import com.desafio.nubank.model.postgresql.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DtoClientMapper {

    DtoClientMapper mapping = Mappers.getMapper(DtoClientMapper.class);

    ClientDto toDto(Client client);

    @Mapping(target = "id", ignore = true)
    Client user(ClientDto clientDto);

    List<ClientDto> toDtoList(List<Client> clients);
}
