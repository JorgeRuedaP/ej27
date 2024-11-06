package Ejercicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ej22 {

	public static void main(String[] args) {
			LocalDate ld=LocalDate.now();
			System.out.println(ld.format(DateTimeFormatter.ofPattern("dd-MM-yy")));
			System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
			System.out.println(ld.getDayOfMonth()+" de "+ld.getMonth()+" de "+ld.getYear());

	}

}
