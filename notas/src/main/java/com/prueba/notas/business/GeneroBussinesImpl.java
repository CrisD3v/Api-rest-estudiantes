package com.prueba.notas.business;

import com.prueba.notas.domain.GeneroDto;
import com.prueba.notas.maper.GeneroMaper;
import com.prueba.notas.model.Genero;
import com.prueba.notas.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GeneroBussinesImpl implements GeneroBussines{
    @Autowired
    GeneroMaper maper;
    @Autowired
    GeneroRepository repository;

    @Override
    public List<GeneroDto> obtenerGenero() {

        List<GeneroDto> listaDto = maper.listadoGeneroDto(repository.findAll());
        return listaDto;
    }

    @Override
    public Boolean crearGenero(GeneroDto dto) {


        Genero genero = maper.fromDtoToEntity(dto);
        repository.save(genero);

        return true;
    }

    @Override
    public Boolean actualizarGenero(GeneroDto dto) {
        Genero genero = maper.fromDtoToEntity(dto);
        repository.save(genero);

        return true;
    }


    @Override
    public Boolean eliminarGenero(GeneroDto dto) {
        Genero genero = maper.fromDtoToEntity(dto);
        repository.delete(genero);

        return true;
    }
}