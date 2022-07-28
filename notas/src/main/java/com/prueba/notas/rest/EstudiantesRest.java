package com.prueba.notas.rest;

import com.prueba.notas.business.EstudiantesBussines;
import com.prueba.notas.domain.EstudianteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// A way to specify that the class is a controller and that it is going to return a json object.
@RestController

// A way to specify the url that is going to be used to call the methods of the controller.
@RequestMapping("/estudiantes/api/v1")

public class EstudiantesRest {

    // Injecting the dependency of the business class into the controller.
    @Autowired
    EstudiantesBussines estudiantesBussines;


    // A method that is going to be called when the user makes a get request to the url
    // `/obtenerEstudiantes`
    @GetMapping("obtenerEstudiantes")
    public List<EstudianteDto> obtenerestudiantes(){

        return estudiantesBussines.obtenerEstudiantes();

    }

    // A method that is going to be called when the user makes a post request to the url
    // `/crearEstudinates`
    @PostMapping("/crearEstudiantes")
    public Boolean crearEstudiantes(@RequestBody EstudianteDto dto){

        return estudiantesBussines.crearEstudiantes(dto);

    }

    // A method that is going to be called when the user makes a put request to the url
    // `/actualizarEstudiantes`
    @PutMapping("/actualizarEstudiantes")
    public Boolean actualizarEstudiantes(@RequestBody EstudianteDto dto){

        return estudiantesBussines.actualizarEstudiantes(dto);

    }

    // A method that is going to be called when the user makes a delete request to the url
    // `/eliminarEstudiantes`
    @DeleteMapping("/eliminarEstudiantes")
    public Boolean eliminarEstudiantes(@RequestBody EstudianteDto dto){

        return estudiantesBussines.eliminarEstudiantes(dto);
    }

}
