package exerciciosListas;

import java.util.Scanner;

public class Exercicio13 {

	public void run() {
		float a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Lados do triangulo");
		System.out.println("\nLado A: ");
		a = input.nextFloat();
		System.out.println("\nLado B: ");
		b = input.nextFloat();
		System.out.println("\nLado C: ");
		c = input.nextFloat();
		if(a  > b + c || b > a + c || c > a + b) {
			System.out.println("Nao eh um triangulo");
		}else {
			if(a == b && a == c && b == c) {
				System.out.println("\nEh um triangulo equilatero");
			}else {
				if(a != b && a!= c && b != c) {
					System.out.println("\nEh um triangulo escaleno");
				}else {
					if(a == b || a == c || b == c) {
						System.out.println("\nEh um triangulo isosceles");
					}
				}
			}
		}
	}
}
