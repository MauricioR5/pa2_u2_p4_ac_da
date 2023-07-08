package com.example.demo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;


@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {
	

	@Autowired
	EstudianteService estudianteService;
	
	@Autowired
	HotelService hotelService;
	
	@Autowired
	HabitacionService habitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
						
		//System.out.println(this.estudianteService.buscarTodos());
	
		Habitacion hab1 = new Habitacion();
		hab1.setNumero("55");
		hab1.setValor(new BigDecimal(100));
		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(hab1);
		
		Hotel hotel = new Hotel();
		hotel.setNombre("Hilton Colon");
		hotel.setDireccion("Av. Colon");
		hotel.setHabitaciones(habitaciones);
		
		this.hotelService.agregar(hotel);
		
		//this.hotelService.agregar(hotel);
		
		//System.out.println(this.hotelService.buscarPorNombre("Hilton Colon"));
	}
}

