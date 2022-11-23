package com.idat.AlumnoMicroservicioIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.AlumnoMicroservicioIIE.model.Alumno;

@Repository
public interface AlumnoRepository  extends JpaRepository<Alumno, Integer>{

}
