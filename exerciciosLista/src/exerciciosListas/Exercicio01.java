package exerciciosListas;

/*
1.  Escreva um program que leia um número inteiro fornecido pelo usuário, 
armazenando-o numa variável apropriada.
Imprima o valor lido.
*/

import java.util.Scanner;

public class Exercicio01 {

public void run() {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Digite um valor inteiro: ");
	int valor = input.nextInt();
	System.out.println("O valor lido foi: " + valor);
	
}

}
