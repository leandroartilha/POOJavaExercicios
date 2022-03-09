package exerciciosListas;

import java.util.Scanner;

public class Exercicio24 {

	public void run() {
		
		Scanner input = new Scanner(System.in);
		int num, opcao, x = 1;
		
		System.out.println("Digite um numero de 1 a 20 para saber sua tabuada: ");
		num = input.nextInt();
		while(num < 1 || num > 20) {
			System.out.println("Digite um numero de 1 a 20 para saber sua tabuada: ");
			num = input.nextInt();
		}
		System.out.println("Opcoes: \n1 - While\n2 - Do-While\n3 - For");
		opcao = input.nextInt();
		switch(opcao) {
			case 1:
				while(x <= 10) {
					System.out.println(" " + num*x);
					x++;
				};
				break;
			case 2:
				do {
					System.out.println(" " + num*x);
					x++;
				}while(x<=10);
				break;
			case 3:
				for(int i=1 ; i<11; i++) {
					System.out.println(" " + num*i);
				};
		}
	}
}
