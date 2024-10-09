package com.tccorp.Lttshop.Modelo;

import java.util.List;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManiProducto mpro = new ManiProducto();
		List<Producto> lispro = mpro.getMproducto();
		for (Producto producto : lispro) {
			System.out.println("IdProducto: " + producto.getIdProducto());
			System.out.println("Nombre: " + producto.getNombre());
			System.out.println("Precio: " + producto.getPrecio());

			System.out.println("--------------------");
		}
	}

}
