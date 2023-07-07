package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Autor;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorRepository autorRepository;

	@Override
	public void agregar(Autor autor) {
		this.autorRepository.insertar(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		this.autorRepository.actualizar(autor);
	}

	@Override
	public void borrar(String id) {
		this.autorRepository.eliminar(id);
	}

	@Override
	public Autor buscarPorId(String id) {
		return this.autorRepository.seleccionarPorId(id);
	}

	@Override
	public Autor buscarPorApellido(String apellido) {
		
		return this.autorRepository.seleccionarPorApellido(apellido);
	}

	@Override
	public Autor buscarPorApellidoyNombre(String apellido, String nombre) {
		
		return this.autorRepository.seleccionarPorApellidoyNombre(apellido, nombre);
	}

	@Override
	public Autor buscarPorApellidoTyped(String apellido) {
		
		return this.autorRepository.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public List<Autor> buscarListPorApellido(String apellido) {
		
		return this.autorRepository.seleccionarListPorApellido(apellido);
	}

	@Override
	public List<Autor> buscarListPorNombreTyped(String nombre) {
		return this.autorRepository.seleccionarListPorNombreTyped(nombre);
	}

	@Override
	public Autor buscarAutorDinamico(String nombre, String apellido, int numPublicaciones) {
		return this.autorRepository.seleccionarAutorDinamico(nombre, apellido, numPublicaciones);
		
	}

	@Override
	public int borrarPorApellido(String apellido) {
		return this.autorRepository.eliminarPorApellido(apellido);
	}

	@Override
	public int actualizarPublicaciones(int numPublicaciones, String nombre) {
		return this.autorRepository.actualizarPorNombre(numPublicaciones, nombre);
	}

	

}
