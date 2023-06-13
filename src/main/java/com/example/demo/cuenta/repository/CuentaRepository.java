package com.example.demo.cuenta.repository;

import com.example.demo.cuenta.modelo.Cuenta;

public interface CuentaRepository {
	public void insertar(Cuenta cuenta);

	public void actualizar(Cuenta cuenta);

	public Cuenta seleccionar(String id);

}
