package Pratica3_OO;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner ler=new Scanner(System.in);
		
		int opcao=0;
		
		System.out.println("Escolha: ");
		System.out.println("1 - Ingresso Normal");
		System.out.println("2 - VIP");
		System.out.println("3 - Camarote");
		opcao=ler.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o valor do ingresso");
			double valor=ler.nextDouble();
			Normal n1 = new Normal(valor);
			n1.
		}
		
	}

}
