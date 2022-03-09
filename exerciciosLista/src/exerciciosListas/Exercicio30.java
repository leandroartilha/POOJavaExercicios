package exerciciosListas;

import java.util.Scanner;

public class Exercicio30 {
	
	public void run() {
		
		int a, b, x = 1, y;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor de a:");
		a = input.nextInt();
		System.out.println("Digite o valor de b:");
		b = input.nextInt();
		
		do {
			
			y = (a*x) + b;
			System.out.println("\n" + y + "->" + x);
			x++;
		}while(x < 6);
		
		
		
		
	}

}

