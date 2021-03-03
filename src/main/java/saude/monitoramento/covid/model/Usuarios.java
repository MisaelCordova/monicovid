package saude.monitoramento.covid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_usuario;
	
	@NotBlank(message = "Nome Obrigatorio")
	private String nome;
	 
	@NotBlank(message = "Email Obrigatorio")
	private String email;
	
	@NotBlank(message = "Senha Obrigatoria")
	private String senha;

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
