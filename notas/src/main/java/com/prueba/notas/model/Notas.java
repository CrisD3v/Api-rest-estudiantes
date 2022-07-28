package com.prueba.notas.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "notas")
public class Notas{
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Integer notas;

    @ManyToMany(mappedBy = "notas")
    private List <Asignatura> asignaturas;

    public Integer getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas = notas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
