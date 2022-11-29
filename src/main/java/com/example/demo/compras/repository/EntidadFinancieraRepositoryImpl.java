package com.example.demo.compras.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.compras.modelo.EntidadFinanciera;

@Repository
//implementamos interfaz
public class EntidadFinancieraRepositoryImpl implements IEntidadFinancieraRepository {

	private static List<EntidadFinanciera> baseEntidades=new ArrayList<>();//
	@Override
	public EntidadFinanciera buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//conexion a la base de datos
				//crud
				//SELECT * FROM CUENTA  C WHERE C.NUMERO= numeroCuenta (repasar SQL)
		EntidadFinanciera entidad =new EntidadFinanciera();
		entidad.setNombre("JEP");
		entidad.setSucursal("Quito,matriz");
		entidad.setTipo("Coperativa de ahorro y credito");
		return entidad;
	}

	@Override
	public EntidadFinanciera buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(EntidadFinanciera entidadFinanciera) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(EntidadFinanciera entidadFinanciera) {
		// TODO Auto-generated method stub
		baseEntidades.add(entidadFinanciera);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
