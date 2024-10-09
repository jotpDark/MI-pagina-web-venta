package com.tccorp.Lttshop.Modelo;

import java.util.ArrayList;
import java.util.List;

public class ManiProducto {

	private List<Producto> mproducto;
	public ManiProducto() {
		this.mproducto = new ArrayList<>();
		mproducto.add(new Producto(1,"cocaCola",4));
		mproducto.add(new Producto(2,"rosca",5));
		mproducto.add(new Producto(3,"dulce",1));
		
	}

	public ManiProducto(List<Producto> mproducto) {
		super();
		this.mproducto = mproducto;
	}

	public List<Producto> getMproducto() {
		return mproducto;
	}

	public void setMproducto(List<Producto> mproducto) {
		this.mproducto = mproducto;
	}
	
	
}
