package com.desafio.nubank.application.mapper.postgresql;

import com.desafio.nubank.application.dto.ContactDto;
import com.desafio.nubank.model.postgresql.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DtoContactMapper {

    DtoContactMapper mapping = Mappers.getMapper(DtoContactMapper.class);

    ContactDto toDto(Contact contact);

    @Mapping(target = "id", ignore = true)
    Contact toEntity(ContactDto contactDto);

    List<ContactDto> toDtoList(List<Contact> contacts);
}
