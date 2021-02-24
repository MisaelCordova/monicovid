package saude.monitoramento.covid.model;

import java.util.Date;

public class Pacientes {
	private long paciente;
	private boolean temCPF;
	private int CNS;
    private Date dateNasc;
    private String nome;
    private String bairro;
    private int telefone;
    private boolean profisSaude;
    private int CPF;
    
    public long getPaciente() {
		return paciente;
	}
	public void setPaciente(long paciente) {
		this.paciente = paciente;
	}
	public boolean isTemCPF() {
		return temCPF;
	}
	public void setTemCPF(boolean temCPF) {
		this.temCPF = temCPF;
	}
	public int getCNS() {
		return CNS;
	}
	public void setCNS(int cNS) {
		CNS = cNS;
	}
	public Date getDateNasc() {
		return dateNasc;
	}
	public void setDateNasc(Date dateNasc) {
		this.dateNasc = dateNasc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public boolean isProfisSaude() {
		return profisSaude;
	}
	public void setProfisSaude(boolean profisSaude) {
		this.profisSaude = profisSaude;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getNomemae() {
		return Nomemae;
	}
	public void setNomemae(String nomemae) {
		Nomemae = nomemae;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	String Nomemae;
    char sexo;
	
}
