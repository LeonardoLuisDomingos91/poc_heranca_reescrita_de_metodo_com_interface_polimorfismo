package service;

import model.Funcionario;

public class ControleDeBonificacoes {
	
	private double somaBonificacoes;
	
	public void somaBonificacoes(Funcionario f) {
		 
		somaBonificacoes = f.getBonificacoes();
	}

	public double getTotalDeBonificacoes() {
		return somaBonificacoes;
	}
}
