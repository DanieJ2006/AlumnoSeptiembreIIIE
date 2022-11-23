package com.idat.AlumnoMicroservicioIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.AlumnoMicroservicioIIE.dto.AlumnoDTO;
import com.idat.AlumnoMicroservicioIIE.service.AlumnoService;

@Controller
@RequestMapping("/api/alumno/v1")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	//cuando creamos mircoservicios, usaremos las notacion getmappin y cuando hacermos rest usamos el rquestmapping
	@GetMapping("/listar")
	public @ResponseBody List<AlumnoDTO> listar(){
		return alumnoService.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody AlumnoDTO obtenerId(@PathVariable Integer id) {
		return alumnoService.obtenerId(id);
		
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody AlumnoDTO alumnoDTO) {
		alumnoService.guardar(alumnoDTO);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody AlumnoDTO alumnoDTO) {
		alumnoService.actualizar(alumnoDTO);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		alumnoService.eliminar(id);
	}
	
	
	
	@GetMapping("/hola")
	public @ResponseBody String hola(){
		return  "Hola Mundo";
	}
	
	
}
