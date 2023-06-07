package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	@Autowired
	private Estudiante estudiante;
	@Override
	public void guardar(Estudiante estu) {
		
	}

}
