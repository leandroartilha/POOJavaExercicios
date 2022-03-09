package exerciciosListas;

import java.util.Scanner;

public class Exercicio07 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" a) A é igual a zero? " + ((a == 0) ? "verdadeiro" : "falso"));
		System.out.println(" b) B é menor que zero?"  + ((b > 0) ? "verdadeiro" : "falso"));
		System.out.println(" c) A OU B são maiores do que zero?" + (((a >0)||(b >0)) ? "verdadeiro" : "falso"));
	}
}
