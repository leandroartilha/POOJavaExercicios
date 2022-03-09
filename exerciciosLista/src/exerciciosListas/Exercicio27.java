package exerciciosListas;

import java.util.Scanner;

public class Exercicio27 {

	public void run() {
		
		double notas, media, i = 0, soma = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Media de notas");
		
		do {
			System.out.println("\nNota: ");
			notas = input.nextDouble();
			
			if(notas>0) {
				soma += notas;
				i++;
			}
			
		}while(notas > 0);
		
		media = soma/i;
		System.out.println("Media Final: " + media);
	}
	
}
