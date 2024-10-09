package com.tccorp.Lttshop.Modelo;

public class Persona {
	// private int idPersona;
	private String nombre;
	private String apellido;
	private String ci;
	private String login;
	private String password;
	private String rol;

	public Persona() {

	}

	public Persona(String nombre, String apellido, String ci, String login, String password,String rol) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.login = login;
		this.password = password;
		this.rol=rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
