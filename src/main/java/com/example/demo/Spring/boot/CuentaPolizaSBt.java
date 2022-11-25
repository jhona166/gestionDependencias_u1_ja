package com.example.demo.Spring.boot;
import java.util.Date;
public class CuentaPolizaSBt extends CuentaSBt {
	
	private Date fechaVigencia;

	@Override
	public void aperturaCuenta(ClienteSBt cliente, float saldo) {
		super.aperturaCuenta(cliente,saldo);
		super.interes=10/100.0f;
		System.out.println("Poliza creada con exito");
	}
	
	@Override
	public String toString() {
		return "CuentaPoliza [fechaVigencia=" + fechaVigencia + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo
				+ ", interes=" + interes + ", cuentaHabiente=" + cuentaHabiente + "]";
	}

	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

}
