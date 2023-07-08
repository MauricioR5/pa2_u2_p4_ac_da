package com.example.demo.repository.modelo.dto;

public class EstudianteDTO {

	private String nombre;
	private String apellido;
	
	public EstudianteDTO() {
		
	}
	public EstudianteDTO(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//SET and GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "\nEstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	
}
