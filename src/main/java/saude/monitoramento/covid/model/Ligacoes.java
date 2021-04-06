package saude.monitoramento.covid.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Ligacoes {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id_ligacao;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private String atendente;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private Date data;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private String sintomas;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	@Enumerated(EnumType.STRING)
	private Evolucao evolucao; 
	
	@ManyToOne
	private Atendimentos atendimentos;
	
	
	public long getId_ligacao() {
		return id_ligacao;
	}
	public Atendimentos getAtendimetos() {
		return atendimentos;
	}
	public void setAtendimetos(Atendimentos atendimetos) {
		this.atendimentos = atendimetos;
	}
	public void setId_ligacao(long id_ligacao) {
		this.id_ligacao = id_ligacao;
	}
	public String getAtendente() {
		return atendente;
	}
	public void setAtendente(String atendente) {
		this.atendente = atendente;
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
	
	
}
