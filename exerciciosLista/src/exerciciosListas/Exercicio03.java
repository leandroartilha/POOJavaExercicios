package exerciciosListas;

import java.util.Scanner;

/*
3. Leia um número qualquer fornecido pelo usuário. Determine se o número é maior do que 50, imprimindo uma mensagem
indicando tal fato.
*/
public class Exercicio03 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		if ( valor > 50){
			System.out.println("O valor lido " + valor + " eh maior que 50!");
		}
	}
}
