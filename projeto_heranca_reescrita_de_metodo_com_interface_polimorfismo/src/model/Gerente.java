package model;

public class Gerente extends Presidente implements Autenticavel {
	
	@Override
	public double getBonificacoes() {
		return this.salario * 0.15;
	}
	
	@Override
	public void autentica(int senha) {
		
		if(this.senha == senha) {
			System.out.println("Liberado");
			System.out.println("Senha: " + this.senha);
		}else {
			System.out.println("Não permitido");
		}
	}

	
}
