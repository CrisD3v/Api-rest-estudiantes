package com.prueba.notas.maper;

import com.prueba.notas.domain.AsignaturaDto;
import com.prueba.notas.domain.EstudianteDto;
import com.prueba.notas.model.Asignatura;
import com.prueba.notas.model.Estudiantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EstudianteMaper {
    @Autowired
    GeneroMaper generoMaper;
    @Autowired
    AsignaturaMaper asignaturaMaper;

   /**
    * It takes a DTO object and converts it to an Entity object
    * 
    * @param dto EstudianteDto
    * @return A list of students.
    */

    public Estudiantes fromDtoToEntity(EstudianteDto dto){
        Estudiantes entity = new Estudiantes();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setLastName(dto.getLastName());
        entity.setAge(dto.getAge());
        entity.setGenero(generoMaper.fromDtoToEntity(dto.getGeneroDto()));
        List<Asignatura> asignaturaEntity=dto.getAsignaturas().stream().map(asignaturaMaper::fromDtoToEntity).collect(Collectors.toList());
        entity.setAsignaturas(asignaturaEntity);

        return entity;

    }

    /**
     * It takes an Estudiantes entity and returns an EstudianteDto
     * 
     * @param entity Estudiantes
     * @return A list of students.
     */
    
    public EstudianteDto fromentityToDto(Estudiantes entity){
        EstudianteDto dto = new EstudianteDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setLastName(entity.getLastName());
        dto.setAge(entity.getAge());
        dto.setGeneroDto(generoMaper.fromentityToDto(entity.getGenero()));
        List<AsignaturaDto> asignaturaDto=entity.getAsignaturas().stream().map(asignaturaMaper::fromEntityToDto).collect(Collectors.toList());
        dto.setAsignaturas(asignaturaDto);

        return dto;
    }

    /**
     * It takes a list of DTOs and returns a list of Entities
     * 
     * @param ListaDto List of DTO objects
     * @return A list of Estudiantes objects.
     */

    public List<Estudiantes> ListadoEstudiantes(List<EstudianteDto> ListaDto){
        List<Estudiantes> listaEntity = new ArrayList<>();
        ListaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return listaEntity;

    }

  /**
   * It takes a list of Estudiantes objects and returns a list of EstudianteDto objects
   * 
   * @param listarEstudiantes List of students
   * @return A list of EstudianteDto objects.
   */

    public List<EstudianteDto> listadoEstudianteDto(List<Estudiantes> listarEstudiantes){
        List<EstudianteDto> listaDto = new ArrayList<>();
        listarEstudiantes.forEach(x -> listaDto.add((fromentityToDto(x))));

        return listaDto;
    }


}
