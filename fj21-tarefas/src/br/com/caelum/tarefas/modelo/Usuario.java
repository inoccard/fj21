package br.com.caelum.tarefas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private int id;
	
	@Size(min = 4, message = "nao pode ser menor que 4 caracteres")
	private String login;
	
	@Size(min = 4, message = "nao pode ser menor que 4")
	private String senha;


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
}
