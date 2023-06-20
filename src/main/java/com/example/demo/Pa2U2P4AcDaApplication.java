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
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;

@SpringBootApplication
public class Pa2U2P4AcDaApplication implements CommandLineRunner {

	
	@Autowired
	private HabitacionService habitacionService;
	@Autowired
	private HotelService hotelService;


	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		Habitacion habitacion =  new Habitacion();
		Habitacion habitacion1 =  new Habitacion();
		Hotel hotel = new Hotel();
		
		List<Habitacion> habitaciones = new ArrayList<>();
		hotel.setDireccion("Av. La Gasca");
		hotel.setHabitaciones(habitaciones);
		
		
		
		habitacion.setNumero("69");
		habitacion.setValor(new BigDecimal(150));
		
		habitacion1.setNumero("50");
		habitacion1.setValor(new BigDecimal(250));
		
		habitaciones.add(habitacion);
		habitaciones.add(habitacion1);
		
		hotel.setHabitaciones(habitaciones);
		hotelService.agregar(hotel);
		
	
	}

}
