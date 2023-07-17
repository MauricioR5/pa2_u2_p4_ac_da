package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;


@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {
	
	@Autowired
	AutorService autorService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
						
		List<Autor> autor1 = this.autorService.buscarAutorJoin();
		for(Autor autor : autor1) {
			System.out.println(autor1);
		}
		List<Autor> autor2 = this.autorService.buscarAutorLeftJoin();
		for(Autor autor : autor2) {
			System.out.println(autor2);
		}
		List<Autor> autor3 = this.autorService.buscarAutorRightJoin();
		for(Autor autor : autor3) {
			System.out.println(autor3);
		}
		List<Autor> autor4 = this.autorService.buscarAutorFullJoin();
		for(Autor autor : autor4) {
			System.out.println(autor4);
		}
		/*List<Autor> autor5 = this.autorService.buscarAutorWhereJoin();
		for(Autor autor : autor5) {
			System.out.println(autor5);
		}*/
	}
}

