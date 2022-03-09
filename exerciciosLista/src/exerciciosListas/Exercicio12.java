package exerciciosListas;

import java.util.Scanner;

public class Exercicio12 {

	public void run() {
		
		float n, total;
		double d;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos copos voce deseja comprar?");
		n = input.nextFloat();
		if(n <= 100) {
			d = 0.05;
			total = n * (float)d;
			System.out.println("\n Valor total eh " + total + "reais");
		}else {
			if(n>100 && n <501) {
				d = 0.04;
				total = n * (float)d;
				System.out.println("\n Valor total eh " + total + "reais");
			}else {
				d = 0.035;
				total = n * (float)d;
				System.out.println("\n Valor total eh " + total + "reais");
			}
		}
		
	}
}
