package saude.monitoramento.covid.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
@Entity
public class Atendimento {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id_atendimento;
	
	private Date fimsintoma;
	private String Localtrabalho;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean  outroteste;
	
	private boolean atestadomedico;
	private Date  ini_atatestado;
	private Date fim_atestado;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	@Enumerated(EnumType.STRING)
	private Evolucao evolucao; 
	
	@OneToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="id_paciente", nullable = false)	
	private Paciente paciente;
	
	@OneToMany(mappedBy = "atendimentos")
	private List<Ligacao> Ligacoes = new ArrayList<>();
	
	public Atendimento() {
	
	}
	

	public Atendimento(Date fimsintoma, String localtrabalho,
			@NotBlank(message = "Preenchimento Obrigatorio") boolean outroteste, boolean atestadomedico,
			Date ini_atatestado, Date fim_atestado, @NotBlank(message = "Preenchimento Obrigatorio") Evolucao evolucao,
			Paciente paciente, List<Ligacao> ligacoes) {
		super();
		this.fimsintoma = fimsintoma;
		Localtrabalho = localtrabalho;
		this.outroteste = outroteste;
		this.atestadomedico = atestadomedico;
		this.ini_atatestado = ini_atatestado;
		this.fim_atestado = fim_atestado;
		this.evolucao = evolucao;
		this.paciente = paciente;
		Ligacoes = ligacoes;
	}











	public long getId_atendimento() {
		return id_atendimento;
	}

	public void setId_atendimento(long id_atendimento) {
		this.id_atendimento = id_atendimento;
	}

	public Date getFimsintoma() {
		return fimsintoma;
	}

	public void setFimsintoma(Date fimsintoma) {
		this.fimsintoma = fimsintoma;
	}

	public String getLocaltrabalho() {
		return Localtrabalho;
	}

	public void setLocaltrabalho(String localtrabalho) {
		Localtrabalho = localtrabalho;
	}

	public boolean isOutroteste() {
		return outroteste;
	}

	public void setOutroteste(boolean outroteste) {
		this.outroteste = outroteste;
	}

	public boolean isAtestadomedico() {
		return atestadomedico;
	}

	public void setAtestadomedico(boolean atestadomedico) {
		this.atestadomedico = atestadomedico;
	}

	public Date getIni_atatestado() {
		return ini_atatestado;
	}

	public void setIni_atatestado(Date ini_atatestado) {
		this.ini_atatestado = ini_atatestado;
	}

	public Date getFim_atestado() {
		return fim_atestado;
	}

	public void setFim_atestado(Date fim_atestado) {
		this.fim_atestado = fim_atestado;
	}
	public Evolucao getEvolucao() {
		return evolucao;
	}
	public void setEvolucao(Evolucao evolucao) {
		this.evolucao = evolucao;
	
	}
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente pacientes) {
		this.paciente = pacientes;
	}

	public List<Ligacao> getLigacoes() {
		return Ligacoes;
	}

	public void setLigacoes(List<Ligacao> ligacoes) {
		Ligacoes = ligacoes;
	}



	@Override
	public String toString() {
		return "Atendimento [id_atendimento=" + id_atendimento + ", fimsintoma=" + fimsintoma + ", Localtrabalho="
				+ Localtrabalho + ", outroteste=" + outroteste + ", atestadomedico=" + atestadomedico
				+ ", ini_atatestado=" + ini_atatestado + ", fim_atestado=" + fim_atestado + ", evolucao=" + evolucao
				+ ", paciente=" + paciente + ", Ligacoes=" + Ligacoes + "]";
	}

	

	
	
}
