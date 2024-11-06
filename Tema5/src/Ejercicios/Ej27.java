package Ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LocalDate ld=Funciones26.dimeFecha("Escribe una fecha en este formato: ", sc);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int n=0;
		do {
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
				System.out.println(Menu1+" dias desde tu nacimiento");
				System.out.println("");
				break;
			case 2:
				int Menu2=EdadMes(ld,sc);
				System.out.println(Menu2+" meses desde tu nacimiento");
				System.out.println("");
				break;
			case 3:
				EdadCompleta(ld,sc);
				System.out.println("");
				break;
			case 4:
				
				break;
			case 0:
				break;
			}
		} while (n>0);
	}
	static public int EdadDias(LocalDate ld,Scanner sc) {
		LocalDate hoy=LocalDate.now();
		int dias = (int) ChronoUnit.DAYS.between(ld,hoy);
		return dias;
	}
	static public int EdadMes(LocalDate ld,Scanner sc) {
		LocalDate hoy=LocalDate.now();
		int mes = (int) ChronoUnit.MONTHS.between(ld,hoy);
		return mes;
	}
	static public void EdadCompleta(LocalDate ld,Scanner sc) {
		LocalDate hoy=LocalDate.now();
		/*int anio = (int) ChronoUnit.YEARS.between(ld,hoy);
		int mes = (int) ChronoUnit.MONTHS.between(ld.plusYears(anio),hoy);
		int dia = (int) ChronoUnit.DAYS.between(ld.plusMonths(mes).plusYears(anio),hoy);
		*/
		Period p = Period.between(ld, hoy);
		System.out.println(p.getYears()+" años "+p.getMonths()+" meses "+p.getDays()+" dias");
	}

}
