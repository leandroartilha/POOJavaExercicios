package exerciciosListas;

import java.util.Scanner;

public class Exercicio04 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		if ( valor < 100){
			System.out.println("O valor lido " + valor + " eh menor que 100!");
		}else {
			System.out.println("O valor lido " + valor + " eh maior ou igual a 100!");
		}
	}
}