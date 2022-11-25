package com.example.demo.Spring.boot;
//import java.math.BigDecimal;
public class CuentaCorrienteSB extends CuentaSB {

	private float montoMinimo;

	@Override
	public void aperturaCuenta(ClienteSB cliente, float saldo) {
		super.aperturaCuenta(cliente,saldo);
		super.interes=8/100.0f;
		System.out.println("Cuenta de Corriente creada con exito");
	}
	
	
	
	@Override
	public String toString() {
		return "CuentaCorriente [montoMinimo=" + montoMinimo + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo
				+ ", interes=" + interes + ", cuentaHabiente=" + cuentaHabiente + "]";
	}

	public float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}
	
}
