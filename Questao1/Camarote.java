package Questao1;

public class Camarote extends Ingresso {

	private String localizacao;
	private float adicionalCamarote;
	
	public Camarote(float valor, String localizacao, float adicionalCamarote) {
		super(valor);
		this.localizacao = localizacao;
		this.adicionalCamarote = adicionalCamarote;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public float getAdicionalCamarote() {
		return adicionalCamarote;
	}

	public void setAdicionalCamarote(float adicionalCamarote) {
		this.adicionalCamarote = adicionalCamarote;
	}
	
	public void valordoIngresso() {
		System.out.println("O valor do Ingresso Camarote é: "+(this.getValor()+this.getAdicionalCamarote()));
		System.out.println("A localização do camarote é: "+this.getLocalizacao());
	}
	
}
