package Pratica3_OO;

public class Camarote extends Ingresso {

	private double valorAdicional;
	private String localizacao;
	
	public Camarote(double valor, double valorAdicional, String localizacao) {
		super(valor);
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
	}
	
	
	
	

	public double getValorAdicional() {
		return valorAdicional;
	}





	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}





	public String getLocalizacao() {
		return localizacao;
	}





	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}





	public void ImprimeIngresso() {
		System.out.println("Ingresso Camarote"+ getValor()+getValorAdicional()+ " " +localizacao);
	}
	
	
}
