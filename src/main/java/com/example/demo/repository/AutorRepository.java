package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Autor;

public interface AutorRepository {

	public void insertar(Autor autor);

	public void actualizar(Autor autor);

	public void eliminar(String id);

	public Autor seleccionarPorId(String id);
	
	public Autor seleccionarPorApellido(String apellido);

	public Autor seleccionarPorApellidoTyped(String apellido);


	public List<Autor> seleccionarListPorApellido(String apellido);

	public Autor seleccionarPorApellidoyNombre(String apellido,String Nombre);
	
	public List<Autor> seleccionarListPorNombreTyped(String nombre);


}
