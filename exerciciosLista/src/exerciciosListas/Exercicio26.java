package exerciciosListas;

import java.util.Scanner;

public class Exercicio26 {

	public void run() {
		double num, resultado = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quando quiser parar de adicionar numeros e somar todos que digitou, digite 0");
		
		do {
			System.out.println("\n Digite um numero: ");
			num = input.nextDouble();
			resultado += num;
			
		}while(num != 0);
		
		System.out.println("Resultado: " + resultado);
	}
	
}
