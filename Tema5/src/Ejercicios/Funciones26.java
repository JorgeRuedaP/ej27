package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funciones26 {
	public static boolean esInt (String texto) {
		try {
			Integer.parseInt(texto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean esDouble (String texto) {
		try {
			Double.parseDouble(texto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static int dimeEntero (String texto, Scanner sc) {
		boolean bien=false;
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();		
				return Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (!bien);
		return 0;
	}
	
	public static double dimeDouble(String texto, Scanner sc) {
		boolean bien=false;	
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();		
				return Double.parseDouble(s);
			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (!bien);
		return 0;
	}
	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.println(texto + "dd/mm/yyyy");
				String s = sc.nextLine();	
				return LocalDate.parse(s,dtf);
			} catch (Exception e) {
				System.out.println("Formato Incorrecto");
			}
		} while (true);
		
	}

}
