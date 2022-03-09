package exerciciosListas;

import java.util.Scanner;

public class Exercicio10 {

	public void run() {
		/* 10. Leia três números quaisquer, imprimindo-os em ordem crescente. */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para B: ");
		int b = input.nextInt();
		System.out.print("Digite um valor para C: ");
		int c = input.nextInt();
		
		if ( (a>b) && (b>c)) { 
			System.out.print("Ordem: "+ a + "> " + b + ">" + c);
		} else {
			if ( (a>c) && (c>b)) { 
				System.out.print("Ordem: "+ a + "> " + c + ">" + b);
			} else {
				if ( (b>a) && (a>c)) { 
					System.out.print("Ordem: "+ b + "> " + a + ">" + c);
				} else {
					if ( (b>c) && (c>a)) { 
						System.out.print("Ordem: "+ b + "> " + c + ">" + a);
					} else {
						if ( (c>a) && (a>b)) { 
							System.out.print("Ordem: "+ c + "> " + a + ">" + b);
						} else {
							// só sobrou ( (c>b) && (b>a))
							System.out.print("Ordem: "+ c + "> " + b + ">" + a);
						}
					}	
				}
			}	
		}
		
		
	}

}