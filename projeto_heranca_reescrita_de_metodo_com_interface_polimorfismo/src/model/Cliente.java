package model;

public class Cliente implements Autenticavel{
	
	private String nome;
	private String cpf;
	private int senha;
	
	@Override
	public void autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Cliente Liberado");
		}else {
			System.out.println("Cliente não permitido");
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
