package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "estudiante")
@Entity

@NamedQuery(name = "Estudiante.buscarPorApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido =: datoApellido")
@NamedQuery(name = "Estudiante.buscarPorNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre =: datoNombre")

@NamedNativeQuery(name = "Estudiante.buscarPorApellidoNative", query = "SELECT * FROM estudiante WHERE estu_apellido=: datoApellido", resultClass = Estudiante.class)
@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative", query = "SELECT * FROM estudiante WHERE estu_nombre=: datoNombre", resultClass = Estudiante.class)

public class Estudiante {
	
	
	@GeneratedValue(generator = "seq_estudiante", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_estudiante",sequenceName = "seq_estudiante", allocationSize = 1)
	@Id
	@Column(name = "estu_id")
	private Integer id;
	
	@Column(name = "estu_cedula")
	private String cedula;
	
	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_apellido")
	private String apellido;
	
	private LocalDateTime fecha;
	
	@Column(name = "estu_peso")
	private Double peso;
	

	
	//GET Y set
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fecha:"+ fecha+"]";
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	} 
	
	
	
}
