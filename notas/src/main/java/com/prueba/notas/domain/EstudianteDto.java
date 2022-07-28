package com.prueba.notas.domain;

import java.util.List;

public class EstudianteDto {
    Long id;
    String name;
    String lastName;
    Integer age;
    GeneroDto generoDto;
    List<AsignaturaDto> asignaturas;

    public GeneroDto getGeneroDto() {
        return generoDto;
    }

    public void setGeneroDto(GeneroDto generoDto) {
        this.generoDto = generoDto;
    }

    public List<AsignaturaDto> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<AsignaturaDto> asignaturas) {
        this.asignaturas = asignaturas;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    

}

