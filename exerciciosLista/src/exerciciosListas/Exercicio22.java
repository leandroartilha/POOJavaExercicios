package exerciciosListas;

import java.util.Scanner;

public class Exercicio22 {

	public void run() {
		
		Scanner input = new Scanner(System.in);
		double p0, v, a, pf;
		int t;
		System.out.println("Calcular posicao final");
		System.out.println("\nDigite a posicao inicial: ");
		p0 = input.nextDouble();
		System.out.println("Digite a velocidade: ");
		v = input.nextDouble();
		System.out.println("Digite a aceleracao: ");
		a = input.nextDouble();
		System.out.println("Digite o tempo: ");
		t = input.nextInt();
		pf = p0 + v + t + ((a*(t*t))/2);
		System.out.println("Posicao final eh igual a: " + pf);
		
	}
}
