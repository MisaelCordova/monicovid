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
public class Ligacao {
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
	private Atendimento atendimentos;
	
	public Ligacao() {
		
	}
	public Ligacao(long id_ligacao, @NotBlank(message = "Preenchimento Obrigatorio") String atendente,
			@NotBlank(message = "Preenchimento Obrigatorio") Date data,
			@NotBlank(message = "Preenchimento Obrigatorio") String sintomas,
			@NotBlank(message = "Preenchimento Obrigatorio") Evolucao evolucao, Atendimento atendimentos) {
		
		this.id_ligacao = id_ligacao;
		this.atendente = atendente;
		this.data = data;
		this.sintomas = sintomas;
		this.evolucao = evolucao;
		this.atendimentos = atendimentos;
	}
	public long getId_ligacao() {
		return id_ligacao;
	}
	public Atendimento getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(Atendimento atendimentos) {
		this.atendimentos = atendimentos;
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
	@Override
	public String toString() {
		return "Ligacao [id_ligacao=" + id_ligacao + ", atendente=" + atendente + ", data=" + data + ", sintomas="
				+ sintomas + ", evolucao=" + evolucao + ", atendimentos=" + atendimentos + "]";
	}
	
	
}
