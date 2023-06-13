package com.example.demo.cuenta.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AumentoServiceImpl implements AumentoService{
	
	public BigDecimal aumentoSaldo(BigDecimal saldo, LocalDate fechaApertura) {
		if(esDiaPar(fechaApertura)) {
			BigDecimal aumento = saldo.multiply(new BigDecimal("0.05"));
			   return saldo.add(aumento);
        } else {
            return saldo;
        
		}
	}

	@Override
	public boolean esDiaPar(LocalDate fecha) {
		 int dia = fecha.getDayOfMonth();
	        return dia % 2 == 0;
	}

}
