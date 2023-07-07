package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Autor;

public interface AutorService {
	
	public void agregar(Autor autor);

	public void actualizar(Autor autor);

	public void borrar(String id);

	public Autor buscarPorId(String id);
	
	public Autor buscarPorApellido(String apellido);

	public Autor buscarPorApellidoyNombre(String apellido, String nombre);

	public Autor buscarPorApellidoTyped(String apellido);

	public List<Autor> buscarListPorApellido(String apellido);
	
	public List<Autor> buscarListPorNombreTyped(String nombre);

	public Autor buscarAutorDinamico(String nombre, String apellido, int numPublicaciones);
	
}
