package com.example.demo.compras.repository;

import com.example.demo.compras.modelo.Prestamo;

public interface IPrestamoRepository {

	
	//CRUD
	
	//depende del sistema utilizar el crud todas las 4r funciones
		//BUSCAR
		public Prestamo buscar(Integer id);//clave primaria//no necesito
		//
		public void actualizar(Prestamo prestamo);//no necestio en el ejmplo
		public void insertar(Prestamo prestamo);
		public void borrar(Integer id);//primarykey//no necesito
		
		
}
