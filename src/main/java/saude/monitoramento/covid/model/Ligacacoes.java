package saude.monitoramento.covid.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Ligacacoes {
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
	private String Evolução; //criar enum
	
	public long getId_ligacao() {
		return id_ligacao;
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
	public String getEvolução() {
		return Evolução;
	}
	public void setEvolução(String evolução) {
		Evolução = evolução;
	}
	
}
