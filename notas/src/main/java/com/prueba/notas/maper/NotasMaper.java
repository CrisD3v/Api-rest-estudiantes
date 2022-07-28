package com.prueba.notas.maper;

import com.prueba.notas.domain.NotasDto;
import com.prueba.notas.model.Notas;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class NotasMaper {
    public Notas fromDtoToEntity(NotasDto dto){
        Notas entity = new Notas();
        entity.setId(dto.getId());
        entity.setNotas(dto.getNotas());
        return entity;

    }
    public NotasDto fromEntityToDto(Notas entity){
        NotasDto dto = new NotasDto();
        dto.setId(entity.getId());
        dto.setNotas(entity.getNotas());
        return dto;
    }
    public List<Notas> ListadoNotas (List<NotasDto> ListaDto){
        List<Notas> listaEntity = new ArrayList<>();
        ListaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return listaEntity;

    }
    public List<NotasDto> listadoNotasDto(List<Notas> listarNotas){
        List<NotasDto> listaDto = new ArrayList<>();
        listarNotas.forEach(x -> listaDto.add((fromEntityToDto(x))));

        return listaDto;
    }


}
