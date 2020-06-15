package view;

import model.Cliente;
import model.Diretor;
import model.Gerente;
import model.Presidente;
import model.SecretariaAdministrativa;
import model.SecretariaAgencia;
import service.ControleDeAutenticacao;
import service.ControleDeBonificacoes;

public class Principal {

	public static void main(String[] args) {
		
		ControleDeAutenticacao  controleDeAunteticacao = new ControleDeAutenticacao();
		
		Presidente presidente = new Presidente();
		presidente.setNome("Leticia");
		presidente.setSalario(5000.0);
		presidente.setSenha(111);
		System.out.println("Presidente: " + "Bonificação " + presidente.getBonificacoes());
		
		
		controleDeAunteticacao.setSenha(222);
		controleDeAunteticacao.atenticador(presidente);
		System.out.println("-----------------------");
		
		Gerente gerente = new Gerente();
		gerente.setNome("Luis");
		gerente.setSalario(1000.0);
		gerente.setSenha(222);
		System.out.println("Gerente: " + "Bonificação " + gerente.getBonificacoes());
		
		
		controleDeAunteticacao.setSenha(222);
		controleDeAunteticacao.atenticador(gerente);
		System.out.println("-----------------------");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Leonardo");
		diretor.setSalario(1000.0);
		System.out.println("Diretor: " + "Bonificação " + diretor.getBonificacoes());
		System.out.println("-----------------------");
		
		SecretariaAdministrativa secretariaAdministrativa = new SecretariaAdministrativa();
		secretariaAdministrativa.setNome("Ana");
		secretariaAdministrativa.setSalario(3000.0);
		secretariaAdministrativa.getBonificacoes();
		System.out.println("Secretaria Administrativa: " + "Bonificação " + secretariaAdministrativa.getBonificacoes());
		System.out.println("-----------------------");
		
		SecretariaAgencia secretariaAgencia = new SecretariaAgencia();
		secretariaAgencia.setNome("patricia");
		secretariaAgencia.setSalario(3000.0);
		secretariaAgencia.getBonificacoes();
		System.out.println("Secretaria Agencia: " + "Bonificação " + secretariaAgencia.getBonificacoes());
		
		System.out.println("-----------------------");
		
		ControleDeBonificacoes controleDeBonificacoes = new ControleDeBonificacoes();
		
		controleDeBonificacoes.somaBonificacoes(presidente);
		controleDeBonificacoes.somaBonificacoes(gerente);
		controleDeBonificacoes.somaBonificacoes(diretor);
		controleDeBonificacoes.somaBonificacoes(secretariaAdministrativa);
		controleDeBonificacoes.somaBonificacoes(secretariaAgencia);
		
		System.out.println("Soma das bonificações q a empresa gastou com todos os funcionarios");
		System.out.println(controleDeBonificacoes.getTotalDeBonificacoes());
		
		System.out.println("---------------------------------------------");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Leticia");
		cliente.setSenha(333);
		
		controleDeAunteticacao.setSenha(222);
		
		//cliente tbm pode ser um autenticavel sem herdar os metodos e atributos de funcionario
		//essa é a vantagem de se usar interface cliente não tem relação nenhuma com as classes de funcionarios
		controleDeAunteticacao.atenticador(cliente);

	}

}
