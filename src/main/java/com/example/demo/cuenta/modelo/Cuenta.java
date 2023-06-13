package com.example.demo.cuenta.modelo;

import java.awt.font.NumericShaper;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "cuenta")
@Entity
public class Cuenta {

	@GeneratedValue(generator = "seq_cuenta", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cuenta", sequenceName = "seq_cuenta", allocationSize = 1)
	@Id
	@Column(name = "cuenta_id")
	private Integer id;
	
	@Column(name = "cuenta_num")
	private String numero;
	
	@Column(name = "cuenta_tipo")
	private String tipo;
	
	@Column(name = "cuenta_fecha")
	private LocalDateTime fechaApertura;
	
	@Column(name = "cuenta_saldo")
	private BigDecimal saldo;
	
	@Column(name = "cuenta_ced")
	private String cedulaPropietario;

	
	// SET y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDateTime fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo
				+ ", cedulaPropietario=" + cedulaPropietario + "]";
	}
	
	


}
