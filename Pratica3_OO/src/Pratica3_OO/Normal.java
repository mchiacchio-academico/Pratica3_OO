package Pratica3_OO;

public class Normal extends Ingresso 
{		
		Normal(double valor){
			super(valor);
		}
		
		public void imprimeIngresso() {
			System.out.println("Ingresso Normal valor: "+getValor());
		}

}
