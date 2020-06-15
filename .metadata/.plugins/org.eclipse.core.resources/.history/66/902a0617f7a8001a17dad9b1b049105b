package view;

import model.Diretor;
import model.Gerente;
import model.Presidente;
import model.SecretariaAdministrativa;
import model.SecretariaAgencia;
import service.ControleDeBonificacoes;

public class Principal {

	public static void main(String[] args) {
		
		Presidente presidente = new Presidente();
		presidente.setNome("Leticia");
		presidente.setSalario(5000.0);
		System.out.println("Presidente: " + "Bonificação " + presidente.getBoificacoes());
		System.out.println("-----------------------");
		
		Gerente gerente = new Gerente();
		gerente.setNome("Luis");
		gerente.setSalario(1000.0);
		System.out.println("Gerente: " + "Bonificação " + gerente.getBoificacoes());
		System.out.println("-----------------------");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Leonardo");
		diretor.setSalario(1000.0);
		System.out.println("Diretor: " + "Bonificação " + diretor.getBoificacoes());
		System.out.println("-----------------------");
		
		SecretariaAdministrativa secretariaAdministrativa = new SecretariaAdministrativa();
		secretariaAdministrativa.setNome("Ana");
		secretariaAdministrativa.setSalario(3000.0);
		secretariaAdministrativa.getBoificacoes();
		System.out.println("Secretaria Administrativa: " + "Bonificação " + secretariaAdministrativa.getBoificacoes());
		System.out.println("-----------------------");
		
		SecretariaAgencia secretariaAgencia = new SecretariaAgencia();
		secretariaAgencia.setNome("patricia");
		secretariaAgencia.setSalario(3000.0);
		secretariaAgencia.getBoificacoes();
		System.out.println("Secretaria Agencia: " + "Bonificação " + secretariaAgencia.getBoificacoes());
		
		System.out.println("-----------------------");
		
		ControleDeBonificacoes controleDeBonificacoes = new ControleDeBonificacoes();
		
		controleDeBonificacoes.somaBonificacoes(presidente);
		controleDeBonificacoes.somaBonificacoes(gerente);
		controleDeBonificacoes.somaBonificacoes(diretor);
		controleDeBonificacoes.somaBonificacoes(secretariaAdministrativa);
		controleDeBonificacoes.somaBonificacoes(secretariaAgencia);
		
		System.out.println("Soma das bonificações q a empresa gastou com todos os funcionarios");
		System.out.println(controleDeBonificacoes.getTotalDeBonificacoes());

	}

}
