package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
import com.example.demo.service.LibroService;

@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {

	@Autowired
	private LibroService libroService;

	@Autowired
	private AutorService autorService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Libro libro = new Libro();
		libro.setEditorial("La uce");
		libro.setTitulo("La importancia de llamarse Jhon");
		
		Libro libro1 = new Libro();
		libro1.setEditorial("La uce");
		libro1.setTitulo("Mil y una noches");
	
		
		Autor autor = new Autor();
		autor.setNombre("Mauricio");
		autor.setApellido("Cacuango");
		
		
		Set<Autor> autores = new HashSet<>();
		autores.add(autor);
		
		libro.setAutores(autores);

		
		Set<Libro> libros = new HashSet<>();
		libros.add(libro);
		libros.add(libro1);

		autor.setLibros(libros);
		
		//this.libroService.agregar(libro);
		autorService.agregar(autor);
		
		
	
	
	}

}
