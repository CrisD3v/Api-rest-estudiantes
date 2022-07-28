package com.prueba.notas.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "asignatura")
public class Asignatura {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Notas> notas;

    @ManyToMany(mappedBy = "asignaturas")
    private List<Estudiantes> estudiantes;

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
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

    public List<Notas> getNotas() {
        return notas;
    }

    public void setNotas(List<Notas> notas) {
        this.notas = notas;
    }

   
}
