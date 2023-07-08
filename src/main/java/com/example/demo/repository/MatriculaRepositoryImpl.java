package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.EstudianteDTO;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class MatriculaRepositoryImpl implements MatriculaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Matricula matricula) {
		this.entityManager.persist(matricula);
		
	}

	@Override
	public void modificar(Matricula matricula) {
		this.entityManager.merge(matricula);
		
	}

	@Override
	public Matricula buscar(Integer id) {
		return this.entityManager.find(Matricula.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.buscar(id));
		
	}

	@Override
	public List<MatriculaDTO> seleccionarTodos() {
		TypedQuery<MatriculaDTO> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(e.alumno, e.materia) FROM Matricula e ", MatriculaDTO.class);
		
		return myQuery.getResultList();
	}

}
