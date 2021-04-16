package saude.monitoramento.covid.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Ligacao {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id_ligacao;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private String atendente;
	
	private String status;
	
	@NotNull
	private Date data;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private String sintomas;
	

	@Enumerated(EnumType.STRING)
	private Evolucao evolucao;
	
	@ManyToOne (fetch = FetchType.LAZY,optional = true)
	@JoinColumn(name = "id_atendimento",nullable = true)
	private Atendimento atendimentos;
	
	
	public Ligacao() {
		
	}

	


	public Ligacao(@NotBlank(message = "Preenchimento Obrigatorio") String atendente, String status, @NotNull Date data,
			@NotBlank(message = "Preenchimento Obrigatorio") String sintomas, Evolucao evolucao,
			Atendimento atendimentos) {
		super();
		this.atendente = atendente;
		this.status = status;
		this.data = data;
		this.sintomas = sintomas;
		this.evolucao = evolucao;
		this.atendimentos = atendimentos;
	}







	public Long getId_ligacao() {
		return id_ligacao;
	}



	public void setId_ligacao(Long id_ligacao) {
		this.id_ligacao = id_ligacao;
	}



	public String getAtendente() {
		return atendente;
	}



	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public String getSintomas() {
		return sintomas;
	}



	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}



	public Evolucao getEvolucao() {
		return evolucao;
	}



	public void setEvolucao(Evolucao evolucao) {
		this.evolucao = evolucao;
	}



	public Atendimento getAtendimentos() {
		return atendimentos;
	}



	public void setAtendimentos(Atendimento atendimentos) {
		this.atendimentos = atendimentos;
	}



	
	
		
	
}
