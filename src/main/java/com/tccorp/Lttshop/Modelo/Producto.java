package com.tccorp.Lttshop.Modelo;

public class Producto {
	private int idProducto;
	private String nombre;
	private float precio;
	
	public Producto() {
		
	}
	public Producto(int idProducto,String nombre, float precio) {
		super();
		this.idProducto=idProducto;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
