package com.myapp.springboot.web.app.models;

public class Usuario {
	private String name;
	private String apellido;
	private String email;
	
	
	
	public Usuario() {}

	public Usuario(String name, String apellido, String email) {
		this.name = name;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
