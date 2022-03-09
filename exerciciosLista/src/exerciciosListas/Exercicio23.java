package exerciciosListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {

	public void run() {
		double pv = 0, j = 0, fv = 0;
		int n = 0;
		Scanner input = new Scanner(System.in); input.useLocale(Locale.US);
		System.out.println("Digite o capital inicial: ");
		pv = input.nextDouble();
		System.out.println("Digite a taxa de juros da aplicacao: ");
		j = input.nextDouble();
		System.out.println("Digite o numero de periodos da aplicacao: ");
		n = input.nextInt();
		
		fv =  (pv* Math.pow(1+j, n));
		System.out.println("Capital futuro: " + fv);
	}
}
