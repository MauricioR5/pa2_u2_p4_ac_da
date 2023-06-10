package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner{
	
	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Dennisse");
		estudiante.setApellido("Quinaucho");
		estudiante.setCedula("175606411");
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Mauricio");
		estudiante1.setApellido("Alban");
		estudiante1.setCedula("810087");
		
		//this.estudianteService.guardar(estudiante);
		//this.estudianteService.guardar(estudiante1);
		this.estudianteService.buscarPorNumero("1756064");	
		this.estudianteService.actualizar(estudiante);
		this.estudianteService.borrar("1756064");
		
	}

}
