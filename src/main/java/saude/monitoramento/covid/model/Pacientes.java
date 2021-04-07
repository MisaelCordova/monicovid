package saude.monitoramento.covid.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Pacientes {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_paciente;
	private boolean temCPF;
	private int CNS;
	
	@NotBlank(message = "Data de Nascimento Obrigatoria")
    private Date dateNasc;
    
    @NotBlank(message = "Nome Obrigatorio")
    private String nome;
  
	private String bairro;
    private int telefone;
    private boolean profisSaude;
    private int CPF;
    private String Nomemae;
    private char sexo;
    
    @OneToOne
    private Condicoes condicoes;
    
    @OneToOne
    private Sintomas sintomas;
    
    @OneToOne
    private Atendimentos atendimentos;
    
    @ManyToOne
    private Notificacoes notificacoes;
    
    public long getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(long id_paciente) {
		this.id_paciente = id_paciente;
	}
	public Condicoes getCondicoes() {
		return condicoes;
	}
	public void setCondicoes(Condicoes condicoes) {
		this.condicoes = condicoes;
	}
	public Sintomas getSintomas() {
		return sintomas;
	}
	public void setSintomas(Sintomas sintomas) {
		this.sintomas = sintomas;
	}
	public Atendimentos getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(Atendimentos atendimentos) {
		this.atendimentos = atendimentos;
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
	
	//Verificar onde como usar hashcode and equals 
	  @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dateNasc == null) ? 0 : dateNasc.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pacientes other = (Pacientes) obj;
			if (dateNasc == null) {
				if (other.dateNasc != null)
					return false;
			} else if (!dateNasc.equals(other.dateNasc))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}
	
	
}
