package com.relacionUnoaUno;
import java.util.List;
import java.util.ArrayList;
/**
 * 
 * @author Alexis Santander
 *
 */



public class Main {

	public static void main(String[] args) {
		
		
		Automovil auto = new Automovil();
		auto.setId(1L);
		auto.setMarca("Chevrolet");
		auto.setModelo("Luv");

		List<Propietario> listaPropietarios = new ArrayList<Propietario> ();
		
		Propietario prop1 = new Propietario ();
		Propietario prop2 = new Propietario ();
		
		prop1.setId(01L);
		prop1.setNombre("Alexis");
		prop1.setApellido("Santander");
		
		prop2.setId(02L);
		prop2.setNombre("Ariel");
		prop2.setApellido("Troncoso");
		
		listaPropietarios.add(prop1);
		listaPropietarios.add(prop2);
		
		auto.setListaPropietario(listaPropietarios);
		
		System.out.println("El Automovil " + auto.getMarca() + " " + auto.getModelo() +
				" tiene como propietario a: " + auto.getListaPropietario().toString());
		
		
		
		

	}

}
