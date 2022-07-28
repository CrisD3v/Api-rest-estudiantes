package com.prueba.notas.business;

import com.prueba.notas.domain.EstudianteDto;

import java.util.List;

public interface EstudiantesBussines {
    public List<EstudianteDto> obtenerEstudiantes();
    public Boolean crearEstudiantes(EstudianteDto dto);
    public Boolean actualizarEstudiantes(EstudianteDto dto);

    public Boolean eliminarEstudiantes(EstudianteDto dto);

}
