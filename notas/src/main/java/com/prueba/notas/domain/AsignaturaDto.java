package com.prueba.notas.domain;

import java.util.List;

public class AsignaturaDto {
    Long id;
    String name;
    List<EstudianteDto> estudiantes;
    List <NotasDto> notas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NotasDto> getNotas() {
        return notas;
    }

    public void setNotas(List<NotasDto> notas) {
        this.notas = notas;
    }

}
