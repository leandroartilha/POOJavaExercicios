package exerciciosListas;

import java.util.Scanner;

public class Exercicio20 {

	public void run() {
		double valor, pes;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor para transforma-lo em pes: ");
		valor = input.nextFloat();
		if(valor < 0) {
			System.out.println("Digite um valor positivo para transforma-lo em pes: ");
			valor = input.nextFloat();
		}
		pes = valor*3.315;
		System.out.println("Valor original: " + valor);
		System.out.println("Valor em pes: " + pes);
	}
}
