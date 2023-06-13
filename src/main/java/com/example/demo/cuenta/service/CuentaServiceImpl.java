package com.example.demo.cuenta.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import com.example.demo.cuenta.modelo.Cuenta;
import com.example.demo.cuenta.repository.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService {
	@Autowired
	private CuentaRepository cuentaRepository;

	@Override
	public void apertura(Cuenta cuenta) {
	
		System.out.println("Fecha de apertura de la cuenta: " + cuenta.getFechaApertura().now());
		
		
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public Cuenta buscar(String id) {
		return this.cuentaRepository.seleccionar(id);
	}
	
	
}
