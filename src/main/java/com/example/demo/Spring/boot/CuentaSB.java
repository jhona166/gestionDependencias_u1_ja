package com.example.demo.Spring.boot;

import org.springframework.stereotype.Service;

//import java.math.BigDecimal;
@Service
public class CuentaSB {

	protected int numeroCuenta;
	protected float saldo;
	protected float interes;
	protected ClienteSB cuentaHabiente;
	
	
	public void aperturaCuenta(ClienteSB cliente, float saldo) {
		System.out.println("aperturando cuenta para el cliente "+ cliente.getNombre()+" "+cliente.getApellido());
		this.saldo=saldo;
	}
	
	
	
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", interes=" + interes
				+ ", cuentaHabiente=" + cuentaHabiente + "]";
	}
	public ClienteSB getCuentaHabiente() {
		return cuentaHabiente;
	}
	public void setCuentaHabiente(ClienteSB cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(float interes) {
		this.interes = interes;
	}
	
}
