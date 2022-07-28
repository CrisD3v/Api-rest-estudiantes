package com.prueba.notas.model;

import javax.persistence.*;

@Entity
@Table(name = "genero")
public class Genero {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String genero;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return genero;
    }

    public void setName(String name) {
        this.genero = name;
    }
}



