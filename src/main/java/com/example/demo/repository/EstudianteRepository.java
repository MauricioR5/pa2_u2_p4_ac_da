package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

public interface EstudianteRepository {
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(String cedula);
	
	public Estudiante seleccionar(String cedula);
	
	public Estudiante seleccionarPorApellido(String apellido);

	public Estudiante seleccionarPorApellidoTyped(String apellido);


	public List<Estudiante> seleccionarListPorApellido(String apellido);
	
	public List<Estudiante> seleccionarListaPorApellidoTyped(String apellido);

	public Estudiante seleccionarPorApellidoyNombre(String apellido,String Nombre);
	
	public Estudiante seleccionarPorApellidoNamed(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);

	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);

	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);
	
	public Estudiante seleccionarPorNombreNamedQuery(String apellido);
	
	public Estudiante seleccionarPorNombreNativeQueryNamed(String apellido);

	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso);
	
	public int eliminarPorNombre(String nombre);

	public int actualizarPorApellido(String nombre, String apellido);
	
	public List<EstudianteDTO> seleccionarTodosDTO();
	
	
	
}
