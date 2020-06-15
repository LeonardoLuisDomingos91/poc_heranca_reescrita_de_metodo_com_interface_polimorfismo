package model;

public class SecretariaAdministrativa extends Secretaria{
	
	@Override
	public double getBonificacoes() {
		return this.salario * 0.04;
	}

}
