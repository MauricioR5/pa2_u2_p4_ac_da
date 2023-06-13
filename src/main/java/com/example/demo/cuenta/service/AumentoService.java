package com.example.demo.cuenta.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface AumentoService {
	
	public BigDecimal aumentoSaldo(BigDecimal saldo);
	
	public  boolean esDiaPar(LocalDateTime fecha);

}
