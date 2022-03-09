package exerciciosListas;

import java.util.Scanner;

public class Exercicio14 {

	public void run() {
		
		float n1, n2, n3, media;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nCalculo de nota");
		System.out.println("\nNota 1: ");
		n1 = input.nextFloat();
		System.out.println("\nNota 2: ");
		n2 = input.nextFloat();
		System.out.println("\nNota 3: ");
		n3 = input.nextFloat();
		
		media = (n1 + n2 + n3)/3;
		if(media > 7) {
			System.out.println("Sua media eh" + media +"\nAprovado!");
		}else {
			if(media < 3) {
				System.out.println("Sua media eh" + media +"\nReprovado!");
			}else {
				if(media >= 3 && media <= 7) {
					System.out.println("Sua media eh" + media +"\nVoce esta de exame!");
				}
			}
		}
		
	}
}
