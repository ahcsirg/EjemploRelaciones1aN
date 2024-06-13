package com.relacionUnoaUno;

public class Propietario {
	
	private Long id;
	private String nombre;
	private String Apellido;
	
	
	public Propietario() {
		
	}


	public Propietario(Long id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		Apellido = apellido;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	@Override
	public String toString() {
		return "Propietario [id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + "]";
	}
	
	
	
	
	
	
	
	
	
}
