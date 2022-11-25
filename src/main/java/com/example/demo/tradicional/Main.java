package com.example.demo.tradicional;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Scanner num=new Scanner(System.in);
		Cliente cliente=new Cliente();
		Cuenta cuenta;
		
		System.out.println("***********Bienvenido al BANCO PICHINCHA ************");
		System.out.println("Ingrese el nombre del cliente");
		cliente.setNombre(in.nextLine());
		System.out.println("Ingrese el apellido del cliente");
		cliente.setApellido(in.nextLine());
		System.out.println("Ingrese la cedula del cliente");
		cliente.setCedula(num.nextInt());
		
		System.out.println(cliente.toString());
		System.out.println("\n ***************** \n  Que tipo de cuenta desea abrir:");
		System.out.println("1. Cuenta de Ahorros");
		System.out.println("2. Cuenta Corriente");
		System.out.println("3. Cuenta de Poliza");
		
		cuenta=crearCuenta(cliente,num.nextInt());
		System.out.println(cuenta.toString());
		
	}
	
	static public Cuenta crearCuenta(Cliente cliente,int opcion) {
		Scanner in=new Scanner(System.in);
		switch (opcion) {
		case 1:
			CuentaAhorros cuentaA=new CuentaAhorros();
			cuentaA.setCuentaHabiente(cliente);
			System.out.println("Ingrese el numero de cuenta");
			cuentaA.setNumeroCuenta(in.nextInt());
			System.out.println("Ingrese el saldo");
			cuentaA.setSaldo(in.nextFloat());
			System.out.println("Ingrese el interes en nueros enteros");
			cuentaA.setInteres(in.nextFloat()/100.0f);
			System.out.println("Ingrese el porcentaje de descuento en nueros enteros");
			cuentaA.setPorcentajeDescuento(in.nextFloat()/100.0f);
			cuentaA.aperturaCuenta(cliente, cuentaA.getSaldo());
			return cuentaA;
		case 2:
			float saldo=0.0f;
			CuentaCorriente cuentaC=new CuentaCorriente();
			cuentaC.setCuentaHabiente(cliente);
			System.out.println("Ingrese el numero de cuenta");
			cuentaC.setNumeroCuenta(in.nextInt());
			System.out.println("Ingrese el monto minino");
			cuentaC.setMontoMinimo(in.nextFloat());
			System.out.println("Ingrese el saldo");
			while (saldo<cuentaC.getMontoMinimo()) {
				System.out.println("************Saldo no valido*************");
				System.out.println("Ingrese el saldo");
				saldo=in.nextFloat();
			}
			cuentaC.setSaldo(saldo);
			System.out.println("Ingrese el interes en nueros enteros");
			cuentaC.setInteres(in.nextFloat()/100.0f);
			
			cuentaC.aperturaCuenta(cliente, cuentaC.getSaldo());
			return cuentaC;
		case 3:
			CuentaPoliza cuentaP=new CuentaPoliza();
			cuentaP.setCuentaHabiente(cliente);
			System.out.println("Ingrese el numero de cuenta");
			cuentaP.setNumeroCuenta(in.nextInt());
			System.out.println("Ingrese el saldo");
			cuentaP.setSaldo(in.nextFloat());
			System.out.println("Ingrese el interes en nueros enteros");
			cuentaP.setInteres(in.nextFloat()/100.0f);
			System.out.println("Ingrese la fecha de vigencia");
			System.out.println("dia DD");
			int dia=in.nextInt();
			System.out.println("mes DD");
			int mes=in.nextInt();
			System.out.println("año DD");
			int anio=in.nextInt();
			Date date=new Date(anio,mes,dia);
			cuentaP.setFechaVigencia(date);
			cuentaP.aperturaCuenta(cliente, cuentaP.getSaldo());
			return cuentaP;
		default:
			Cuenta cuenta=new Cuenta();
			return cuenta;
		}
	}

}
