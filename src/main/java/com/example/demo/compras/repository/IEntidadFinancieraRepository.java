package com.example.demo.compras.repository;

import com.example.demo.compras.modelo.EntidadFinanciera;

public interface IEntidadFinancieraRepository {
	
	//
	public EntidadFinanciera buscarPorNumero(String numeroCuenta);
	//public void actualizar (CuentaBancaria cuentaBancaria);
		
	
	//CRUD
	
	//BUSCAR
	public EntidadFinanciera buscar(Integer id);//clave primaria
	//
	public void actualizar(EntidadFinanciera entidadFinanciera);
	public void insertar(EntidadFinanciera entidadFinanciera);
	public void borrar(Integer id);//primarykey

}
