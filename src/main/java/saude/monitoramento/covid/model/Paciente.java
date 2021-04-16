package saude.monitoramento.covid.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;


@Entity
public class Paciente {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_paciente;
	private boolean temCPF;
	
	@Column(unique=true)
	private long CNS;
	
	//@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
    private Date dateNasc;
    
    @NotBlank(message = "Nome Obrigatorio")
    private String nome;
  
	private String bairro;
    private long telefone;
    private boolean profisSaude;
    
    @Column(unique=true)
    private long CPF;
    private String Nomemae;
    private char sexo;
    
    @OneToOne (mappedBy = "paciente",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Condicao condicoes;
    
    @OneToOne(mappedBy = "paciente",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Sintoma sintomas;
    
    @OneToOne (mappedBy = "paciente",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Atendimento atendimentos;
    
    @OneToMany (mappedBy = "paciente",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Notificacao> noticacoes;
    
    
    public Paciente() {
    	
    }
    
	public Paciente(boolean temCPF, long cNS, @NotBlank(message = "Data de Nascimento Obrigatoria") Date dateNasc,
			@NotBlank(message = "Nome Obrigatorio") String nome, String bairro, long telefone, boolean profisSaude,
			long cPF, String nomemae, char sexo) {
		this.temCPF = temCPF;
		CNS = cNS;
		this.dateNasc = dateNasc;
		this.nome = nome;
		this.bairro = bairro;
		this.telefone = telefone;
		this.profisSaude = profisSaude;
		CPF = cPF;
		Nomemae = nomemae;
		this.sexo = sexo;
	}

	public Long getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Long id_paciente) {
		this.id_paciente = id_paciente;
	}

	public boolean isTemCPF() {
		return temCPF;
	}

	public void setTemCPF(boolean temCPF) {
		this.temCPF = temCPF;
	}

	public long getCNS() {
		return CNS;
	}

	public void setCNS(long cNS) {
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

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public boolean isProfisSaude() {
		return profisSaude;
	}

	public void setProfisSaude(boolean profisSaude) {
		this.profisSaude = profisSaude;
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
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

	public Condicao getCondicoes() {
		return condicoes;
	}

	public void setCondicoes(Condicao condicoes) {
		this.condicoes = condicoes;
	}

	public Sintoma getSintomas() {
		return sintomas;
	}

	public void setSintomas(Sintoma sintomas) {
		this.sintomas = sintomas;
	}

	public Atendimento getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(Atendimento atendimentos) {
		this.atendimentos = atendimentos;
	}

	public Set<Notificacao> getNoticacoes() {
		return noticacoes;
	}

	public void setNoticacoes(Set<Notificacao> noticacoes) {
		this.noticacoes = noticacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateNasc == null) ? 0 : dateNasc.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	//Verificar onde como usar hashcode and equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
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

	@Override
	public String toString() {
		return "Paciente [id_paciente=" + id_paciente + ", temCPF=" + temCPF + ", CNS=" + CNS + ", dateNasc=" + dateNasc
				+ ", nome=" + nome + ", bairro=" + bairro + ", telefone=" + telefone + ", profisSaude=" + profisSaude
				+ ", CPF=" + CPF + ", Nomemae=" + Nomemae + ", sexo=" + sexo + ", condicoes=" + condicoes
				+ ", sintomas=" + sintomas + ", atendimentos=" + atendimentos + ", noticacoes=" + noticacoes + "]";
	}


	
	
}
