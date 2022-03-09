package exerciciosListas;

import java.util.Scanner;

public class Exercicio15 {

	public void run() {
		
		int x, y, soma, mult;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero inteiro X: ");
		x = input.nextInt();
		System.out.println("Digite um numero inteiro Y: ");
		y = input.nextInt();
		soma = x + y;
		mult = x * y;
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da multiplicacao: " + mult);
		if(x == y) {
			System.out.println(x  + " = " + y);
		}else {
			if(x > y) {
				System.out.println(x  + " > " + y);
			}else {
				if(x < y) {
					System.out.println(x  + " < " + y);
				}
			}
		}
		
		
	}
}
