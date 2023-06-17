package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {

	@Autowired
	private CiudadanoService ciudadanoService;

	@Autowired
	private EmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// agregar
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setApellido("Andrade");
		ciudadano.setNombre("Dennisse");
		ciudadano.setCedula("12344445");

		this.ciudadanoService.agregar(ciudadano);

		Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setApellido("Cacuango");
		ciudadano1.setNombre("Mauricio");
		ciudadano1.setCedula("1745246464");

		this.ciudadanoService.agregar(ciudadano1);
		
		Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setApellido("Cacuango");
		ciudadano2.setNombre("Mauricio");
		ciudadano2.setCedula("1745246464");

	//	this.ciudadanoService.agregar(ciudadano2);

		// actualizar
		// ciudadano.setNombre("alexandra");
		// this.ciudadanoService.actualizar(ciudadano1);

		// borrar
		// this.ciudadanoService.borrar(ciudadano.getCedula());

		// buscar
		// this.ciudadanoService.buscarPorCedula(ciudadano1.getCedula());

		// EMPLEADO*******************************************************
		// insertar
		Empleado empleado = new Empleado();
		empleado.setCargo("Admin");
		empleado.setSueldo(new BigDecimal(1000));
		empleado.setCiudadano(ciudadano2);

		this.empleadoService.agregar(empleado);

	/*	Empleado empleado1 = new Empleado();
		empleado1.setCargo("RH");
		empleado1.setSueldo(new BigDecimal(500));
		empleado1.setCiudadano(ciudadano1);

		this.empleadoService.agregar(empleado1);*/

		// borrar
		// this.empleadoService.borrar(empleado.getCiudadano().getCedula());

		// actualizar
		// empleado.setCiudadano(ciudadano1);
		// this.empleadoService.actualizar(empleado);

		// buscar
		// this.empleadoService.buscarPorId(empleado.getCiudadano().getCedula());
	}

}
