package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {

	@Autowired
	MatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Materia materia = new Materia();
		
		materia.setNombre("Programacion II");
		
		Alumno alumno = new Alumno();
		
		alumno.setNombre("Mauricio");
		
		Matricula matricula = new Matricula();
		
		matricula.setFecha(LocalDateTime.now());
		matricula.setMateria(materia);
		matricula.setNumero("1");
		matricula.setAlumno(alumno);
		
		List<Matricula> matriculas = new ArrayList<>();
		
		matriculas.add(matricula);
		
		alumno.setMatriculas(matriculas);
		materia.setMatriculas(matriculas);
		
		
		this.matriculaService.guardar(matricula);
		
		
	
	
	
	}

}
