package model;

public class Presidente extends Funcionario implements Autenticavel{
	
	protected int senha;

	@Override
	public double getBonificacoes() {
		return this.salario * 0.20;
	}

	@Override
	public void autentica(int senha) {
		
		if(this.senha == senha)
			System.out.println("Liberado");
		else {
			System.out.println("Não permitido");
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
