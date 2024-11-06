package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LocalDate ld=LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int n=0;
		do {
			ld=Funciones26.dimeFecha("Escribe una fecha en este formato: ", sc);
			System.out.println("Menu:");
			System.out.println("1. Calcular edad en dias");
			System.out.println("2. Calcular edad en meses");
			System.out.println("3. Mostrar edad completa");
			System.out.println("4. Calcular dias al proximo cumpleaños");
			System.out.println("0. Salir");
			n=Funciones26.dimeEntero("Elije una opcion", sc);
			switch (n) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 0:
				break;
			}
			break;
		} while (true);
	}

}
