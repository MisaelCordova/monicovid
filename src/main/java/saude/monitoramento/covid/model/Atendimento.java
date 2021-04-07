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
	private String Desfeixo; //criar enum
	
	@OneToOne
	private Paciente pacientes;
	
	@ManyToOne
	private Ligacao Ligacoes;
	
	public Atendimento() {
	
	}
	public Atendimento(long id_atendimento, Date fimsintoma, String localtrabalho,
			@NotBlank(message = "Preenchimento Obrigatorio") boolean outroteste, boolean atestadomedico,
			Date ini_atatestado, Date fim_atestado, @NotBlank(message = "Preenchimento Obrigatorio") String desfeixo,
			Paciente pacientes, saude.monitoramento.covid.model.Ligacao ligacoes) {
		super();
		this.id_atendimento = id_atendimento;
		this.fimsintoma = fimsintoma;
		Localtrabalho = localtrabalho;
		this.outroteste = outroteste;
		this.atestadomedico = atestadomedico;
		this.ini_atatestado = ini_atatestado;
		this.fim_atestado = fim_atestado;
		Desfeixo = desfeixo;
		this.pacientes = pacientes;
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
	public String getDesfeixo() {
		return Desfeixo;
	}
	public void setDesfeixo(String desfeixo) {
		Desfeixo = desfeixo;
	}
	
	@Override
	public String toString() {
		return "Atendimento [id_atendimento=" + id_atendimento + ", fimsintoma=" + fimsintoma + ", Localtrabalho="
				+ Localtrabalho + ", outroteste=" + outroteste + ", atestadomedico=" + atestadomedico
				+ ", ini_atatestado=" + ini_atatestado + ", fim_atestado=" + fim_atestado + ", Desfeixo=" + Desfeixo
				+ ", pacientes=" + pacientes + ", Ligacoes=" + Ligacoes + "]";
	}
	
	
	
}