package Questao2;

public class Empresa {

	public static void main(String[] args) {
		
		Fpadrao f1 = new Fpadrao(123, "João \n", 1000);
		System.out.println(f1.toString());
		
		Fcomissionado f2 = new Fcomissionado(14, "Maria \n", 1000, 500, 10);
		System.out.println(f2.toString());
	}

}
