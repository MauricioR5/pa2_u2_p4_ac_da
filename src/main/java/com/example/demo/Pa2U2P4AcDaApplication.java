package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.EstudianteRepository;
import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.MatriculaService;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {

	@Autowired
	EstudianteRepository estudianteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Naranjito");
		estudiante.setCedula("984984964");
		estudiante.setNombre("Cristiana");
		
		//this.estudianteRepository.insertar(estudiante);
		this.estudianteRepository.seleccionarPorApellido("Naranjito");
		

		this.estudianteRepository.seleccionarListPorApellido("Cacuango");

		this.estudianteRepository.seleccionarPorApellidoyNombre("Naranjito", "Cristiana");
		this.estudianteRepository.seleccionarPorApellidoTyped("Naranjito");
		
	
	}

}
