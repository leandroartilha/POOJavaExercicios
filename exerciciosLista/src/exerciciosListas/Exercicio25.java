package exerciciosListas;

import java.util.Scanner;

public class Exercicio25 {
	
	public void run() {
		
		double qtd, num, resultado = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos numeros voce deseja somar? ");
		qtd = input.nextDouble();
		for(int i = 1; i <= qtd; i++) {
			System.out.println(i+"o numero  ser somado: ");
			num = input.nextDouble();
			resultado += num;
		}
		System.out.println("Resuldado: " + resultado);
	}

}
