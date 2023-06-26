package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {

	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void borrar(String cedula);
	public Estudiante buscarPorNumero(String cedula);
	
	public Estudiante buscarPorApellido(String apellido);

	public Estudiante buscarPorApellidoyNombre(String apellido, String nombre);

	public Estudiante buscarPorApellidoTyped(String apellido);

	public List<Estudiante> reporte(String apellido);


}
