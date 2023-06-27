package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(String cedula);
	public Estudiante seleccionar(String cedula);
	
	public Estudiante seleccionarPorApellido(String apellido);
	
	public Estudiante seleccionarPorApellidoTyped(String apellido);

	public Estudiante seleccionarPorApellidoNamed(String apellido);
	
	public List<Estudiante> seleccionarListPorApellido(String apellido);
	
	
	public Estudiante seleccionarPorApellidoyNombre(String apellido,String Nombre);

}
