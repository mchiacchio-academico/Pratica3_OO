package Pratica3_OO;

public class VIP extends Ingresso {

		private double valorAdicional;
		VIP(double valor, double valorAdicional){
			super(valor);
			this.valorAdicional=valorAdicional;
		}
		
		public void ImprimeIngresso() {
			System.out.println("Ingresso vip"+ getValor()+getValorAdicional(C));
		}
		
}
