package com.example.demo;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Spring.boot.ClienteSB;
import com.example.demo.Spring.boot.CuentaAhorrosSB;
import com.example.demo.sistema.herencia.ClienteH;
import com.example.demo.sistema.herencia.CuentaH;
import com.example.demo.sistema.herencia.CuentaAhorrosH;

@SpringBootApplication
public class ProyectoU1JpDependenciasTarea1Application implements CommandLineRunner {

	@Autowired
	//private PacienteTerceraEdadSB pacienteTE;
	private ClienteSB cliente;
	@Autowired
	private CuentaAhorrosSB cuenta;
	//@Autowired
	//private MedicoSB medicoSB;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JpDependenciasTarea1Application.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		Scanner in=new Scanner(System.in);
		Scanner num=new Scanner(System.in);
		//ClienteSB cliente=new ClienteSB();
		//CuentaAhorros cuenta;
		
		System.out.println("***********Bienvenido al BANCO PICHINCHA ************");
		System.out.println("Ingrese el nombre del cliente");
		this.cliente.setNombre(in.nextLine());
		System.out.println("Ingrese el apellido del cliente");
		this.cliente.setApellido(in.nextLine());
		System.out.println("Ingrese la cedula del cliente");
		this.cliente.setCedula(num.nextInt());
		System.out.println(cliente.toString());
			//CuentaAhorros cuentaA=new CuentaAhorros();
			this.cuenta.setCuentaHabiente(cliente);
			System.out.println("Ingrese el numero de cuenta");
			this.cuenta.setNumeroCuenta(in.nextInt());
			System.out.println("Ingrese el saldo");
			this.cuenta.setSaldo(in.nextFloat());
			System.out.println("Ingrese el interes en nueros enteros");
			this.cuenta.setInteres(in.nextFloat()/100.0f);
			System.out.println("Ingrese el porcentaje de descuento en nueros enteros");
			this.cuenta.setPorcentajeDescuento(in.nextFloat()/100.0f);
			this.cuenta.aperturaCuenta(cliente, cuenta.getSaldo());
			System.out.println(cuenta);

			
	}

}
