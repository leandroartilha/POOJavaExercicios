package exerciciosListas;

import java.util.Scanner;

public class Exercicio28 {
	
	public void run() {
		
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Tabela verdade com 0 ou 1");
		do {
			System.out.println("\nInsira o valor de a: ");
			a = input.nextInt();
		}while(a != 0 && a != 1);
		
		do {
			System.out.println("\nInsira o valor de b: ");
			b = input.nextInt();
		}while(b != 0 && b != 1);
		
		do {
			System.out.println("\nInsira o valor de c: ");
			c = input.nextInt();
		}while(c != 0 && c != 1);
		
		if(a*b*c == 0) {
			System.out.println("V");
		}else {
			if(a*b*c == 1) {
				System.out.println("F");
			}
			
		}
		
	}

}
