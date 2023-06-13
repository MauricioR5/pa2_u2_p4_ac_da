package com.example.demo.cuenta.service;

import com.example.demo.cuenta.modelo.Cuenta;

public interface CuentaService {
	public void apertura(Cuenta cuenta);

	public void actualizar(Cuenta cuenta);

	public Cuenta buscar(String id);

}
