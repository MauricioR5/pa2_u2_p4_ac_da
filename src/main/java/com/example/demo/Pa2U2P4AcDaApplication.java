package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Autor;
import com.example.demo.service.AutorService;


@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {
	
	@Autowired
	AutorRepository autorRepository;

	@Autowired
	AutorService autorService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		Autor autor = new Autor();
		autor.setNombre("Miguel");
		autor.setApellido("Cacuango");
		
		Autor autor1 = new Autor();
		autor1.setNombre("Karen");
		autor1.setApellido("Jacome");
		
		Autor autor2 = new Autor();
		autor2.setNombre("Mauricio");
		autor2.setApellido("Cacuango");
		
	/*	this.autorRepository.insertar(autor);
		this.autorRepository.insertar(autor1);
		this.autorRepository.insertar(autor2);
		*/
		// Usando Query con single result
		System.out.println(this.autorService.buscarPorApellido("Jacome"));
		
		// Usando Query con result list
		List<Autor> lista = this.autorService.buscarListPorApellido("Cacuango");
		System.out.println("Lista de Resultado: ");
		for(Autor listaAutor : lista) {
			System.out.println(listaAutor);
		}
		
		// Usando TypedQuery con single result
		System.out.println(this.autorService.buscarPorApellidoyNombre("Jacome","Karen"));

		// Usando TypedQuery con result list
		List<Autor> lista1 = this.autorService.buscarListPorNombreTyped("Mauricio");
		System.out.println("Lista de Resultado: ");
		for(Autor listaAutor1 : lista1) {
			System.out.println(listaAutor1);
		
		}
		
			}

}

