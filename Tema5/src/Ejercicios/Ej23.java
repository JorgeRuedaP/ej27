package Ejercicios;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Ej23 {

	public static void main(String[] args) {
		LocalDate hoy= LocalDate.now();
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ultimoDiaMes = hoy.with(TemporalAdjusters.lastDayOfMonth());
		LocalDate primerDiaAño = hoy.with(TemporalAdjusters.firstDayOfYear());

		
		System.out.println(hoy.format(formato));
		System.out.println(" ");
		System.out.println(hoy.plusDays(2).format(formato));
		System.out.println(hoy.plusWeeks(1).format(formato));
		System.out.println(hoy.plusYears(2).format(formato));
		System.out.println(hoy.plusMonths(4).format(formato));
		System.out.println(ultimoDiaMes.format(formato));
		System.out.println(primerDiaAño.format(formato));
		

	}

	

}
