package exerciciosListas;

import java.util.Scanner;

public class Exercicio05 {
	public void run() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int valor = input.nextInt();
		if ( (valor % 2) == 0 ) {
			System.out.println("O valor lido " + valor + "  é par! ");
		} else {
			System.out.println("O valor lido " + valor + "  é impar! ");
		}
		
		
	}
}
