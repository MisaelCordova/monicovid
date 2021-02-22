package saude.monitoramento.covid.model;

import java.util.Date;

public class Ligacacoes {
	private int id_ligacao;
	private String atendente;
	private Date data;
	private String sintomas;
	private String Evolução; //criar enum
	
	public int getId_ligacao() {
		return id_ligacao;
	}
	public void setId_ligacao(int id_ligacao) {
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
