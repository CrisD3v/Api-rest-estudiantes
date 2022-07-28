package com.prueba.notas.rest;

import com.prueba.notas.business.NotasBussines;
import com.prueba.notas.domain.NotasDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas/api/v1")

public class NotasRest {
    @Autowired
    NotasBussines notasBussines;
    @GetMapping("obtenerNotas")
    public List<NotasDto> obtenernotas(){

        return notasBussines.obtenerNotas();

    }
    @PostMapping("/crearNotas")
    public Boolean crearNotas(@RequestBody NotasDto dto){

        return notasBussines.crearNotas(dto);

    }
    @PutMapping("/actualizarNotas")
    public Boolean actualizarNotas(@RequestBody NotasDto dto){

        return notasBussines.actualizarNotas(dto);

    }
    @DeleteMapping("/eliminarNotas")
    public Boolean eliminarNotas(@RequestBody NotasDto dto){

        return notasBussines.eliminarNotas(dto);
    }
}
