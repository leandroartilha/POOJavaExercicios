package exerciciosListas;

import java.util.Scanner;

public class MainExe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Qual exercicio voce deseja rodar 1..30): ");
		int opcao = input.nextInt();
		switch (opcao) {
			case 1: {
				Exercicio01 exercicio01 = new Exercicio01();
				exercicio01.run();
			} break;
			case 2: {
				Exercicio02 exercicio02 = new Exercicio02();
				exercicio02.run();
			} break;
			case 3: {
				Exercicio03 exercicio03 = new Exercicio03();
				exercicio03.run();
			} break;
			case 4: {
				Exercicio04 exercicio04 = new Exercicio04();
				exercicio04.run();
			} break;
			case 5: {
				Exercicio05 exercicio05 = new Exercicio05();
				exercicio05.run();
			} break;
			case 6: {
				Exercicio06 exercicio06 = new Exercicio06();
				exercicio06.run02();
			} break;
			case 7 :{
				Exercicio07 exercicio07 = new Exercicio07();
				exercicio07.run();
			}break;
			case  8:{
				Exercicio08 exercicio08 = new Exercicio08();
				exercicio08.run();
			}break;
			case 9 :{
				Exercicio09 exercicio09 = new Exercicio09();
				exercicio09.run();
			}break;			
			case 10 :{
				Exercicio10 exercicio10 = new Exercicio10();
				exercicio10.run();
			}break;		
			case 11 :{
				Exercicio11 exercicio11 = new Exercicio11();
				exercicio11.run();
			}break;		
			case 12 :{
				Exercicio12 exercicio12 = new Exercicio12();
				exercicio12.run();
			}break;	
			case 13 :{
				Exercicio13 exercicio13 = new Exercicio13();
				exercicio13.run();
			}break;	
			case 14 :{
				Exercicio14 exercicio14 = new Exercicio14();
				exercicio14.run();
			}break;	
			case 15 :{
				Exercicio15 exercicio15 = new Exercicio15();
				exercicio15.run();
			}break;	
			case 16 :{
				Exercicio16 exercicio16 = new Exercicio16();
				exercicio16.run();
			}break;	
			case 17 :{
				Exercicio17 exercicio17 = new Exercicio17();
				exercicio17.run();
			}break;	
			case 18 :{
				Exercicio18 exercicio18 = new Exercicio18();
				exercicio18.run();
			}break;	
			case 19:{
				Exercicio19 exercicio19 = new Exercicio19();
				exercicio19.run();
			}
			case 20:{
				Exercicio20 exercicio20 = new Exercicio20();
				exercicio20.run();
			}
			case 21:{
				Exercicio21 exercicio21 = new Exercicio21();
				exercicio21.run();
			}
			case 22:{
				Exercicio22 exercicio22 = new Exercicio22();
				exercicio22.run();
			}
			case 23:{
				Exercicio23 exercicio23 = new Exercicio23();
				exercicio23.run();
			}
			case 24:{
				Exercicio24 exercicio24 = new Exercicio24();
				exercicio24.run();
			}
			case 25:{
				Exercicio25 exercicio25 = new Exercicio25();
				exercicio25.run();
			}
			case 26:{
				Exercicio26 exercicio26 = new Exercicio26();
				exercicio26.run();
			}
			case 27:{
				Exercicio27 exercicio27 = new Exercicio27();
				exercicio27.run();
			}
			case 28:{
				Exercicio28 exercicio28 = new Exercicio28();
				exercicio28.run();
			}
			case 29:{
				Exercicio29 exercicio29 = new Exercicio29();
				exercicio29.run();
			}
			case 30:{
				Exercicio30 exercicio30 = new Exercicio30();
				exercicio30.run();
			}
			
		}		
	}
	
}
