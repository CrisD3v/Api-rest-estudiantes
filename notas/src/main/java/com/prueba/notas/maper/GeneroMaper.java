package com.prueba.notas.maper;

import com.prueba.notas.domain.GeneroDto;
import com.prueba.notas.model.Genero;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class GeneroMaper {
    public Genero fromDtoToEntity(GeneroDto dto){

        Genero entity = new Genero();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;

    }
    public GeneroDto fromentityToDto(Genero entity){
        if (entity == null) {

            return null;
        }
        GeneroDto dto = new GeneroDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
    public List<Genero> ListadoGenero (List<GeneroDto> ListaDto){
        List<Genero> listaEntity = new ArrayList<>();
        ListaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return listaEntity;

    }
    public List<GeneroDto> listadoGeneroDto(List<Genero> listarGenero){
        List<GeneroDto> listaDto = new ArrayList<>();
        listarGenero.forEach(x -> listaDto.add((fromentityToDto(x))));

        return listaDto;
    }
}
