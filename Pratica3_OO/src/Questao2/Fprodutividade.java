package Questao2;

public class Fprodutividade extends Funcionario {
private double valor;
private int producao;

public Fprodutividade(int matricula, String nome, double salario, double valor, int producao) {
	super(matricula, nome, salario);
	this.valor = valor;
	this.producao = producao;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

public int getProducao() {
	return producao;
}

public void setProducao(int producao) {
	this.producao = producao;
}

public double calculaProventos() {
	return getSalario()+(this.valor*this.producao);
}

public String toString() {
	return "Nome: " + getNome() + "Salario: " + calculaProventos();
}


}
