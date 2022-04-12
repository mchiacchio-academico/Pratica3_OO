package Questao1;

public class VIP extends Ingresso {

	private float adicionalVIP;
	
	public VIP(float valor, float adicionalVIP) {
		super(valor);
		this.adicionalVIP = adicionalVIP;
	}
	
	
	public float getAdicionalVIP() {
		return adicionalVIP;
	}


	public void setAdicionalVIP(float adicionalVIP) {
		this.adicionalVIP = adicionalVIP;
	}


	public void valordoIngresso() {
		System.out.println("O valor do Ingresso VIP é: "+(this.getValor()+this.getAdicionalVIP()));
	}
	
}
