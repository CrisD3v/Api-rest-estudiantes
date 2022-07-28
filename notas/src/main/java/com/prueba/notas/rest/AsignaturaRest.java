package com.prueba.notas.rest;

import com.prueba.notas.business.AsignaturaBussines;
import com.prueba.notas.domain.AsignaturaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asignatura/api/v1")
public class AsignaturaRest {
    @Autowired
    AsignaturaBussines asignaturaBussines;
    @GetMapping("obtenerAsignaturas")
    public List<AsignaturaDto> obtenerAsignaturas(){

        return asignaturaBussines.obtenerAsignaturas();

    }
    @PostMapping("/crearAsignaturas")
    public Boolean crearAsignaturas(@RequestBody AsignaturaDto dto){

        return asignaturaBussines.crearAsiignatura(dto);

    }
    @PutMapping("/actualizarAsignaturas")
    public Boolean actualizarAsignaturas(@RequestBody AsignaturaDto dto){

        return asignaturaBussines.actualizarAsignatura(dto);

    }
    @DeleteMapping("/eliminarAsignaturas")
    public Boolean eliminarAsignaturas(@RequestBody AsignaturaDto dto){

        return asignaturaBussines.eliminarAsignatura(dto);
    }

}
