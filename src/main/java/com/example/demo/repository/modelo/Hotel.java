package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Hotel {

	@Id
	@Column(name = "hote_id")
	private Integer id;
	
	@Column(name = "hote_nombre")
	private String nombre;
	
	@Column(name = "hote_direccion")
	private String direccion;

	@OneToMany(mappedBy = "hotel")
	private List<Habitacion> habitaciones;

	
	//Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	
	
}
