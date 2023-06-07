package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {

	@Autowired
	public EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	 Estudiante estudiante = new Estudiante();
	 Estudiante estudiante1 = new Estudiante();

	 estudiante.setApellido("Andrade");
	 estudiante.setCedula("cedula");
	 estudiante.setNombre("Ale");
	 
	 estudiante1.setApellido("Cacuango");
	 estudiante1.setCedula("cedula");
	 estudiante1.setNombre("Mau");
	 
		estudianteService.guardar(estudiante);
		estudianteService.guardar(estudiante1);
		
	}
	


}
