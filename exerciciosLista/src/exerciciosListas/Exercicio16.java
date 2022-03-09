package exerciciosListas;

import java.util.Scanner;

public class Exercicio16 {

	public void run() {
		
		float area, base, altura;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Area do triangulo");
		System.out.println("\nValor da base: ");
		base = input.nextFloat();
		System.out.println("Valor da altura: ");
		altura = input.nextFloat();
		area = (base*altura)/2;
		System.out.println("A area desse tringulo eh de " + area);
		
	}
}
