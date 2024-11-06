package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
				int Menu1=EdadDias(ld,sc);
				System.out.println(Menu1+" dias para tu cumpleaños");
				break;
			case 2:
				int Menu2=EdadMes(ld,sc);
				System.out.println(Menu2+" meses para tu cumpleaños");
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 0:
				break;
			}
			break;
		} while (n==0);
	}
	static public int EdadDias(LocalDate ld,Scanner sc) {
		LocalDate hoy=LocalDate.now();
		int dias = (int) ChronoUnit.DAYS.between(hoy,ld);
		return dias;
	}
	static public int EdadMes(LocalDate ld,Scanner sc) {
		LocalDate hoy=LocalDate.now();
		int mes = (int) ChronoUnit.MONTHS.between(hoy,ld);
		return mes;
	}

}
