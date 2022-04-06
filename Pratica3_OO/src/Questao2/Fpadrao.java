package Questao2;

public class Fpadrao extends Funcionario {

	public Fpadrao(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
	}
	
	public double calculaProventos() {
		return getSalario();
	}
	
	public String toString() {
		return "Nome: " + getNome() + "Salario: " + getSalario();
	}
}
