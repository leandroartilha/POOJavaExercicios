package exerciciosListas;

/*
 Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � m�ltiplo de B ou se B � m�ltiplo
de A. 
  
 */

import java.util.Scanner;

public class Exercicio11 {
	public void run() {
		
		int valorA, valorB;
		Scanner input = new Scanner(System.in);
		System.out.print("Descobrir se um numero eh multiplo de outro");
		System.out.print("Digite um valor inteiro A: ");
		valorA = input.nextInt();
		System.out.print("Digite um valor inteiro B: ");
		valorB = input.nextInt();
		if(valorA % valorB == 0) {
			System.out.println( "\n" + valorA + " Eh multiplo de " + valorB );
		}else {
			System.out.println("\n" + valorA + "Nao eh multiplo de "+ valorB);
		}
		
	}

	
}
