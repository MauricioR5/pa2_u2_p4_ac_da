package com.example.demo.cuenta.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.cuenta.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class CuentaRepositoryImpl implements CuentaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Cuenta cuenta) {
		this.entityManager.persist(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.entityManager.merge(cuenta);
	}

	@Override
	public Cuenta seleccionar(String id) {
		return this.entityManager.find(Cuenta.class, id);
	}

}
