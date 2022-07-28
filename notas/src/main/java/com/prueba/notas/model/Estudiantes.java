package com.prueba.notas.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "estuduantes")
public class Estudiantes {

    @Column
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private Integer age;

   // Creating a relationship between the Estudiantes and Genero tables.
    @ManyToOne
    @JoinColumn(referencedColumnName = "id",name = "id_genero")
    private Genero genero;

   // Creating a relationship between the Estudiantes and Asignatura tables.
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Asignatura> asignaturas;

    public Long getId() {
        return id;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
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

