package com.example.demo.sistema.herencia;
import java.util.Date;
public class CuentaPolizaH extends CuentaH {
	
	private Date fechaVigencia;

	@Override
	public void aperturaCuenta(ClienteH cliente, float saldo) {
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
