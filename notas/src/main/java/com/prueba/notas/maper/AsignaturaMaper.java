package com.prueba.notas.maper;

import com.prueba.notas.domain.AsignaturaDto;
import com.prueba.notas.domain.NotasDto;
import com.prueba.notas.model.Asignatura;
import com.prueba.notas.model.Notas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AsignaturaMaper {

    @Autowired
    NotasMaper notasMaper;

    public Asignatura fromDtoToEntity(AsignaturaDto dto){
        Asignatura entity = new Asignatura();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        List <Notas> notasEntity = dto.getNotas().stream().map(notasMaper::fromDtoToEntity).collect(Collectors.toList());
        entity.setNotas(notasEntity);
        return entity;

    }
    public AsignaturaDto fromEntityToDto(Asignatura entity){
        AsignaturaDto dto = new AsignaturaDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        List <NotasDto> notasDto = entity.getNotas().stream().map(notasMaper::fromEntityToDto).collect(Collectors.toList());
        dto.setNotas(notasDto);
        return dto;
    }
    public List<Asignatura>  ListadoAsignatura (List<AsignaturaDto> ListaDto){
        List<Asignatura> listaEntity = new ArrayList<>();
        ListaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return listaEntity;

    }
    public List<AsignaturaDto> listadoAsignaturaDto(List<Asignatura> listarAsignatura){
        List<AsignaturaDto> listaDto = new ArrayList<>();
        listarAsignatura.forEach(x -> listaDto.add((fromEntityToDto(x))));

        return listaDto;
    }
}
