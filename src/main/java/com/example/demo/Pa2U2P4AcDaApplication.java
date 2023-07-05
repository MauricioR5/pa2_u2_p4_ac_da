package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;


@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {
	

	@Autowired
	EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Miguel");
		estudiante.setApellido("Cacuango");
		estudiante.setPeso(100.2);
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Karen");
		estudiante1.setApellido("Jacome");
		estudiante1.setPeso(50.0);
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Cristina");
		estudiante2.setApellido("Riviera");
		estudiante2.setPeso(55.0);
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Roberto");
		estudiante3.setApellido("Guagua");
		estudiante3.setPeso(70.0);
		
	//this.estudianteService.guardar(estudiante3);
	//this.estudianteService.guardar(estudiante2);
		
		//System.out.println(this.estudianteService.buscarEstudianteDinamico("Miguel", "Cacuango", 100.2));
		//System.out.println(this.estudianteService.buscarEstudianteDinamico("Karen", "Jacome", 50.0));

		System.out.println(this.estudianteService.borrarPorNombre("Miguel"));
		System.out.println(this.estudianteService.actualizarPorApellido("Alison", "Riviera"));
		
		
	
	/*	this.autorRepository.insertar(autor);
		this.autorRepository.insertar(autor1);
		this.autorRepository.insertar(autor2);
		
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
		for(Autor listaAutor1 : lista1) 
			System.out.println(listaAutor1);}
			
		*/
		
		
			}

}

