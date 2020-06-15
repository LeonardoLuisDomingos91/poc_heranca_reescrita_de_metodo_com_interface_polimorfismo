package model;

public class SecretariaAgencia extends Secretaria{
	
	@Override
	public double getBonificacoes() {
		return this.salario * 0.03;
	}
}
