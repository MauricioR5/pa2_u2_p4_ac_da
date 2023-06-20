package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
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
	
				Ciudadano ciudadano = new Ciudadano();
				ciudadano.setApellido("Cacuango");
				ciudadano.setNombre("Alexander");
				ciudadano.setCedula("1723524664");
				
			//	this.ciudadanoService.agregar(ciudadano);
				
				Ciudadano ciudadano1 = new Ciudadano();
				ciudadano1.setApellido("Alban.");
				ciudadano1.setNombre("Mauricio");
				ciudadano1.setCedula("11518151981");
				
			//	this.ciudadanoService.agregar(ciudadano1);
				
				//actualizar
			/*	ciudadano.setNombre("Luna Joel");
				this.ciudadanoService.actualizar(ciudadano1);
				
				//borrar
				//this.ciudadanoService.borrar(ciudadano.getCedula());
				
				//buscar
				this.ciudadanoService.buscarPorCedula(ciudadano1.getCedula());
				*/
				// EMPLEADO*******************
				//insertar
				Empleado empleado = new Empleado();
				empleado.setCargo("Administracion");
				empleado.setSueldo(new BigDecimal(1500));
				empleado.setCiudadano(ciudadano);
				
			this.empleadoService.agregar(empleado);
				
				Empleado empleado1 = new Empleado();
				empleado1.setCargo("Recursos Humanos");
				empleado1.setSueldo(new BigDecimal(800));
				empleado1.setCiudadano(ciudadano1);
				
				this.empleadoService.agregar(empleado1);
				
				//borrar
				//this.empleadoService.borrar(empleado.getCiudadano().getCedula());
				
				//actualizar
			/*	empleado.setCiudadano(ciudadano1);
				this.empleadoService.actualizar(empleado);
				
				//buscar
				this.empleadoService.buscarPorId(empleado.getCiudadano().getCedula());
	
	*/}

}
