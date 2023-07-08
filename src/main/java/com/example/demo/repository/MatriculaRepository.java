package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

public interface MatriculaRepository {

	public void insertar(Matricula matricula);
	public void modificar(Matricula matricula);
	public Matricula buscar(Integer id);
	public void eliminar(Integer id);
	
	public List<MatriculaDTO> seleccionarTodos();
	
	
}
