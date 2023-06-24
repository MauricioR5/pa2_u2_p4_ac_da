package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// SQL
		// Select* From estudiante where e.estu_apellido =
		// JPQL
		// SELECT e FROM Estudiante e WHERE e.apellido =
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();

	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		Query myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre =: datoNombre");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

}
