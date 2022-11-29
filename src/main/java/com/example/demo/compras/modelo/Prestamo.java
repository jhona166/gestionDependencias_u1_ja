package com.example.demo.compras.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Prestamo {

	private String tipo;
	private BigDecimal monto;
	private BigDecimal interes;
	private String cuentaBancaria;
	private LocalDateTime fecha;
	private String estado;//estado prestamo
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getInteres() {
		return interes;
	}
	public void setInteres(BigDecimal interes) {
		this.interes = interes;
	}
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumero() {
		return estado;
	}
	public void setNumero(String numero) {
		this.estado = numero;
	}	
}
