package com.example.demo.sistema;

//import java.math.BigDecimal;

public class Cuenta {

	protected int numeroCuenta;
	protected float saldo;
	protected float interes;
	protected Cliente cuentaHabiente;
	
	
	public void aperturaCuenta(Cliente cliente, float saldo) {
		System.out.println("aperturando cuenta para el cliente "+ cliente.getNombre()+" "+cliente.getApellido());
		this.saldo=saldo;
	}
	
	
	
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", interes=" + interes
				+ ", cuentaHabiente=" + cuentaHabiente + "]";
	}
	public Cliente getCuentaHabiente() {
		return cuentaHabiente;
	}
	public void setCuentaHabiente(Cliente cuentaHabiente) {
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
