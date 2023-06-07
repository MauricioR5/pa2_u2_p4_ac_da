package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository{
@Autowired
private Estudiante estudiante;
	@Override
	public void insertar(String nombre) {
	estudiante.setNombre(nombre);
		
	}

}
