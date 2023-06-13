package com.example.demo.cuenta.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface AumentoService {
	
	public BigDecimal aumentoSaldo(BigDecimal saldo, LocalDate fechaApertura);
	
	public  boolean esDiaPar(LocalDate fecha);

}
