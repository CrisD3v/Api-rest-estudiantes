package com.prueba.notas.business;

import com.prueba.notas.domain.AsignaturaDto;
import com.prueba.notas.maper.AsignaturaMaper;
import com.prueba.notas.repository.AsignaturaRepository;
import com.prueba.notas.model.Asignatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaBussinesImpl implements AsignaturaBussines{
    @Autowired
    AsignaturaMaper maper;
    @Autowired
    AsignaturaRepository repository;

    @Override
    public List<AsignaturaDto> obtenerAsignaturas() {

        List<AsignaturaDto> listaDto = maper.listadoAsignaturaDto(repository.findAll());
        return listaDto;
    }

    @Override
    public Boolean crearAsiignatura(AsignaturaDto dto) {


        Asignatura asignatura = maper.fromDtoToEntity(dto);
        repository.save(asignatura);

        return true;
    }

    @Override
    public Boolean actualizarAsignatura(AsignaturaDto dto) {
        Asignatura asignatura = maper.fromDtoToEntity(dto);
        repository.save(asignatura);

        return true;
    }

    @Override
    public Boolean eliminarAsignatura(AsignaturaDto dto) {
        Asignatura asignatura = maper.fromDtoToEntity(dto);
        repository.delete(asignatura);

        return true;
    }
}
