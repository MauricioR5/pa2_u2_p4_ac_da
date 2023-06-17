package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Habitacion {

	@Id
	@Column(name = "habi_id")
	private Integer id;

	@Column(name = "habi_numero")
	private String numero;
	
	@Column(name = "habi_valor")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "habi_id_hotel")
	private Hotel hotel;

	//Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	
}
