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
public class Atendimentos {
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
	private Pacientes pacientes;
	
	@ManyToOne
	private Ligacoes Ligacoes;
	
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
	
	
}
