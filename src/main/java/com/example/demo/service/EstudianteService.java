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

	public List<Estudiante> reportePorApellido(String apellido);
	
	public List<Estudiante> reportePorApellidoTyped(String apellido);

	
	public Estudiante buscarPorApellidoNamed(String apellido);

	public Estudiante buscarPorApellidoNamedQuery(String apellido);

	public Estudiante buscarPorApellidoNativeQuery(String apellido);

	public Estudiante buscarPorApellidoNativeQueryNamed(String apellido);

	public Estudiante buscarPorNombreNativeQuery(String nombre);

	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	public Estudiante buscarEstudianteDinamico(String nombre, String apellido, Double peso);
	
	public int borrarPorNombre(String nombre);

	public int actualizarPorApellido(String nombre, String apellido);


}
