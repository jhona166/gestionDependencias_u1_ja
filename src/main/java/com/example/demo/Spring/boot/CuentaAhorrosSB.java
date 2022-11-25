package com.example.demo.Spring.boot;

import org.springframework.stereotype.Component;

//import java.math.BigDecimal;

@Component
public class CuentaAhorrosSB extends CuentaSB {
	
	private float porcentajeDescuento;

	public CuentaAhorrosSB() {
		
	}
	
	@Override
	public void aperturaCuenta(ClienteSB cliente, float saldo) {
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
