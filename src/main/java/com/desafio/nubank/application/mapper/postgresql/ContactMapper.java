package com.desafio.nubank.application.mapper.postgresql;

import com.desafio.nubank.application.dto.RequestContactDto;
import com.desafio.nubank.model.postgresql.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    ContactMapper mapping = Mappers.getMapper(ContactMapper.class);

    @Mapping(target = "id", ignore = true)
    Contact contactUser(RequestContactDto requestContactDto);

}
