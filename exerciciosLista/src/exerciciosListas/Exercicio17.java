package exerciciosListas;

import java.util.Scanner;

public class Exercicio17 {

	public void run() {
		int segundos, horas;
		Scanner input = new Scanner(System.in);
		System.out.println("Transformacao de minutos em horas");
		segundos = input.nextInt();
		horas = segundos/3600;
		System.out.println("\n" + segundos + "segundos equivalem a " + horas + " horas");
		
	}
}
