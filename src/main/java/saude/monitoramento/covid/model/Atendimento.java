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
import javax.validation.constraints.NotNull;
@Entity
public class Atendimento {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id_atendimento;
	
	private Date fimsintoma;
	private String Localtrabalho;
	
	private boolean  outroteste;
	
	private boolean atestadomedico;
	private Date  ini_atatestado;
	private Date fim_atestado;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Desfeixo desfeixo; 
	
	@OneToOne(fetch = FetchType.LAZY,optional = true)
	@JoinColumn(name="id_paciente", nullable = true)	
	private Paciente paciente;
	
	@OneToMany(mappedBy = "atendimentos")
	private List<Ligacao> Ligacoes = new ArrayList<>();
	
	public Atendimento() {
	
	}

	public Atendimento(Date fimsintoma, String localtrabalho,
			@NotBlank(message = "Preenchimento Obrigatorio") boolean outroteste, boolean atestadomedico,
			Date ini_atatestado, Date fim_atestado, @NotBlank(message = "Preenchimento Obrigatorio") Desfeixo desfeixo,
			Paciente paciente, List<Ligacao> ligacoes) {
			this.fimsintoma = fimsintoma;
		Localtrabalho = localtrabalho;
		this.outroteste = outroteste;
		this.atestadomedico = atestadomedico;
		this.ini_atatestado = ini_atatestado;
		this.fim_atestado = fim_atestado;
		this.desfeixo = desfeixo;
		this.paciente = paciente;
		Ligacoes = ligacoes;
	}

	public Long getId_atendimento() {
		return id_atendimento;
	}

	public void setId_atendimento(Long id_atendimento) {
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

	public Desfeixo getDesfeixo() {
		return desfeixo;
	}

	public void setDesfeixo(Desfeixo desfeixo) {
		this.desfeixo = desfeixo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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
				+ ", ini_atatestado=" + ini_atatestado + ", fim_atestado=" + fim_atestado + ", desfeixo=" + desfeixo
				+ ", paciente=" + paciente + ", Ligacoes=" + Ligacoes + "]";
	}
	








	

	
	
}
