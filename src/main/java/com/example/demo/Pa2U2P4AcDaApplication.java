package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.AutorService;
import com.example.demo.service.EstudianteService;


@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {
	

	@Autowired
	AutorService autorService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
						
		/*Autor autor1 = new Autor();
		autor1.setApellido("Borges");
		autor1.setNombre("Jorge");
		autor1.setNumPublicaciones(50);
		
		Autor autor2 = new Autor();
		autor2.setApellido("Jacome");
		autor2.setNombre("Kareen");
		autor2.setNumPublicaciones(25);
		
		this.autorService.agregar(autor1);
		this.autorService.agregar(autor2);

		
		System.out.println(this.autorService.buscarAutorDinamico("Jorge", "Borges", 50));
		System.out.println(this.autorService.buscarAutorDinamico("Kareen", "Jacome", 25));

*/
		
		//this.autorService.borrarPorApellido("Jacome");
		this.autorService.actualizarPublicaciones(50, "Luis");
	}
}

