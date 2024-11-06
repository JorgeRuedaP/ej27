package Ejercicios;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dia=0,mes=0,anio=0;
		LocalDate ld= LocalDate.of(2000,1,1);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		do {
			try {
			dia=Funciones26.dimeEntero("Escribe un dia", sc);
			mes=Funciones26.dimeEntero("Escribe un mes", sc);
			anio=Funciones26.dimeEntero("Escribe un año", sc);
			ld= LocalDate.of(anio,mes,dia);
			
			break;
				} catch (Exception e) {
					System.out.println("Formato Incorrecto");
				}
		} while (true);
		
		System.out.println(ld.format(dtf));
		
		LocalDate escFecha=dimeFecha("Escribe una fecha en este formato: ", sc);
		System.out.println(escFecha.format(dtf));
		System.out.println(escFecha.getDayOfMonth()+" "+escFecha.getMonth()+" "+escFecha.getYear());
		LocalDate primerDiaMesSiguiente = escFecha.with(TemporalAdjusters.firstDayOfNextMonth());
		LocalDate primerDiaAnioSiguiente = escFecha.with(TemporalAdjusters.firstDayOfNextYear());
		int dias = (int) ChronoUnit.DAYS.between(escFecha,primerDiaMesSiguiente);
		int anios = (int) ChronoUnit.DAYS.between(escFecha,primerDiaAnioSiguiente);
		System.out.println(dias+"dias para que termine este mes");
		System.out.println(anios+"dias para que termine este año");
		
		LocalDate hoy= LocalDate.now();
		LocalDate F26=dimeFecha("Escribe una fecha en este formato: ", sc);
		
		if(hoy.isBefore(F26)) {
			System.out.println(hoy.format(dtf)+" Es posterior a la fecha de hoy");
		}else if(hoy.isAfter(F26)) {
			System.out.println(hoy.format(dtf)+" Es anterior a la fecha de hoy");
		}else if(hoy.isEqual(F26)) {
			System.out.println(hoy.format(dtf)+" Es igual a la fecha de hoy");
		}

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
