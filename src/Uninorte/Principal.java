package Uninorte;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Myriam","Hern�ndez");
		Persona persona2 = new Persona("Yesmith","Hern�ndez");
		Persona persona3 = new Persona("Bertha","�lvarez");
		LinkedList<Persona> listaPersonas = new LinkedList<Persona>();
				
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		
		Scanner sc = new Scanner (System.in);
		
		for (Persona persona : listaPersonas) {
			System.out.println("\n\rDe:");
			System.out.println(persona.getNombreCompleto());
			System.out.println("Digite la direcci�n");
			persona.setDireccion(sc.nextLine());
			System.out.println("Digite el Tel�fono");
			persona.setTelefono(sc.nextLine());
			System.out.println("Digite la Correo");
			persona.setCorreo(sc.nextLine());
		
						
		}
		sc.close();
		
		for (Persona persona : listaPersonas) {
			System.out.println(persona.getNombreCompleto()+"|"+persona.getDireccion()+"|"+persona.getTelefono()+"|"+persona.getCorreo());
			
		}
	}

}
