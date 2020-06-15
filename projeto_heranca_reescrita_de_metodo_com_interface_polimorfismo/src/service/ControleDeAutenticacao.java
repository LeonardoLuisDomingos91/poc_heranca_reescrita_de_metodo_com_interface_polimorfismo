package service;

import model.Autenticavel;

public class ControleDeAutenticacao {
	
	private int senha;
	
	//Presidente, gerente e cliente podem fazer uso desse método pois implementam a interface Autenticavel
	//Se vir existir outra classe e fazer sentido ser autenticada basta implementar essa interface Autenticavel
	public void atenticador(Autenticavel a) {
		a.autentica(senha);
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
