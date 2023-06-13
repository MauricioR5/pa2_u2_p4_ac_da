package com.example.demo.cuenta.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AumentoServiceImpl implements AumentoService{
	
	public BigDecimal aumentoSaldo(BigDecimal saldo) {
		
		LocalDateTime fechaApertura = LocalDateTime.now();
		if(esDiaPar(fechaApertura)) {
			BigDecimal aumento = saldo.multiply(new BigDecimal(5).divide(new BigDecimal(100)));
			   return saldo.add(aumento);
        } else {
            return saldo;
        
		}
	}

	@Override
	public boolean esDiaPar(LocalDateTime fecha) {
		 int dia = fecha.getDayOfMonth();
	        return dia % 2 == 0;
	}


}
