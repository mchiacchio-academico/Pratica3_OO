package Questao1;

import java.util.Scanner;

public class Carnaval_Ingressos {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
				
		System.out.println("----------------------");
		System.out.println("Escola uma opção:");
		System.out.println("(1) Ingresso Normal");
		System.out.println("(2) VIP");
		System.out.println("(3) Camarote");
		System.out.println("----------------------");
		short opcao=ler.nextShort();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o valor do ingresso");
			Normal i1 = new Normal(ler.nextFloat());
			i1.valordoIngresso();
			break;
		case 2: 
			System.out.println("Digite o valor do ingresso + o adicional");
			VIP i2 = new VIP(ler.nextFloat(), ler.nextFloat());
			i2.valordoIngresso();
			break;
		case 3:
			System.out.println("Digite o valor do ingresso, a localização do camarote e o valor adicional");
			Camarote i3 = new Camarote(ler.nextFloat(), ler.next(), ler.nextFloat());
			i3.valordoIngresso();
		}
		
		
	}

}
