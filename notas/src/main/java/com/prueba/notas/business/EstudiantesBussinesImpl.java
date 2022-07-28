package com.prueba.notas.business;

import com.prueba.notas.domain.EstudianteDto;
import com.prueba.notas.maper.EstudianteMaper;
import com.prueba.notas.model.Estudiantes;
import com.prueba.notas.repository.EstudiantesRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudiantesBussinesImpl implements EstudiantesBussines{
    @Autowired
    EstudianteMaper maper;
    @Autowired
    EstudiantesRepositpry repository;

    @Override
    public List<EstudianteDto> obtenerEstudiantes() {

        List<EstudianteDto> listaDto = maper.listadoEstudianteDto(repository.findAll());
        return listaDto;
    }

    @Override
    public Boolean crearEstudiantes(EstudianteDto dto) {


        Estudiantes estudiantes = maper.fromDtoToEntity(dto);
        repository.save(estudiantes);

        return true;
    }

    @Override
    public Boolean actualizarEstudiantes(EstudianteDto dto) {
        Estudiantes estudiantes = maper.fromDtoToEntity(dto);
        repository.save(estudiantes);

        return true;
    }


    @Override
    public Boolean eliminarEstudiantes(EstudianteDto dto) {
        Estudiantes estudiantes = maper.fromDtoToEntity(dto);
        repository.delete(estudiantes);

        return true;
    }
}