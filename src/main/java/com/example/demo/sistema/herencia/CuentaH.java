package com.example.demo.sistema.herencia;

//import java.math.BigDecimal;

public class CuentaH {

	protected int numeroCuenta;
	protected float saldo;
	protected float interes;
	protected ClienteH cuentaHabiente;
	
	
	public void aperturaCuenta(ClienteH cliente, float saldo) {
		System.out.println("aperturando cuenta para el cliente "+ cliente.getNombre()+" "+cliente.getApellido());
		this.saldo=saldo;
	}
	
	
	
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", interes=" + interes
				+ ", cuentaHabiente=" + cuentaHabiente + "]";
	}
	public ClienteH getCuentaHabiente() {
		return cuentaHabiente;
	}
	public void setCuentaHabiente(ClienteH cuentaHabiente) {
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
