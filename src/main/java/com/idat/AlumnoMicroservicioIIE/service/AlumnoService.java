package com.idat.AlumnoMicroservicioIIE.service;

import java.util.List;

import com.idat.AlumnoMicroservicioIIE.dto.AlumnoDTO;

public interface AlumnoService {
	
	List<AlumnoDTO> listar();	
	AlumnoDTO obtenerId(Integer id);
	void guardar(AlumnoDTO alumnoDTO);
	void eliminar(Integer id);
	void actualizar (AlumnoDTO alumnoDTO);
	

}
