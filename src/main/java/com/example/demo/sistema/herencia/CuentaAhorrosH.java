package com.example.demo.sistema.herencia;

//import java.math.BigDecimal;

public class CuentaAhorrosH extends CuentaH {
	
	private float porcentajeDescuento;

	public CuentaAhorrosH() {
		
	}
	
	@Override
	public void aperturaCuenta(ClienteH cliente, float saldo) {
		super.aperturaCuenta(cliente,saldo);
		super.interes=10/100.0f;
		System.out.println("Cuenta de Ahorros creada con exito");
	}
	

	@Override
	public String toString() {
		return "CuentaAhorros [porcentajeDescuento=" + porcentajeDescuento + ", numeroCuenta=" + numeroCuenta
				+ ", saldo=" + saldo + ", interes=" + interes + ", cuentaHabiente=" + cuentaHabiente + "]";
	}

	public float getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(float porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	

}
