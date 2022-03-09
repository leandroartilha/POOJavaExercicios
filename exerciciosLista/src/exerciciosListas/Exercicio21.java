package exerciciosListas;

import java.util.Scanner;

public class Exercicio21 {

	public void run() {
		double a, b, c, delta, x1, x2;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor A");
		a = input.nextDouble();
		System.out.println("Digite o valor B");
		b = input.nextDouble();
		System.out.println("Digite o valor C");
		c = input.nextDouble();
		
		delta = (b*b) - 4*a*c;
		x1 = ((-b) + Math.sqrt(delta))/2*a;
		x2 = ((-b) - Math.sqrt(delta))/2*a;
		System.out.println("\nDelta: " + delta);
		System.out.println("\nRaiz 1: " + x1);
		System.out.println("\nRaiz 2: " + x2);
		
	}
}
