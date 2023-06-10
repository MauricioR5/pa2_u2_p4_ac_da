package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante); // permite insertar una entidad en la base de datos
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante); // permite actualizar una entidad en la base de datos
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estu = this.seleccionar(cedula);
		this.entityManager.remove(estu);
	}

	@Override
	public Estudiante seleccionar(String cedula) {

		// this.entityManager.find(Estudiante.class, cedula);
		return this.entityManager.find(Estudiante.class, cedula); // indica que se va a trabajar con una clase
																	// Estuidiante
	}

}
