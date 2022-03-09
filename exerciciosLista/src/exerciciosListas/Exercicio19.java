package exerciciosListas;

import java.util.Scanner;

public class Exercicio19 {

	public void run() {
		
		
		double numero = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero entre 0.00 e 100.00: ");
		numero = input.nextDouble();
		double valor_decimal = numero - (int)(numero);
		System.out.println(valor_decimal);
	}
}
