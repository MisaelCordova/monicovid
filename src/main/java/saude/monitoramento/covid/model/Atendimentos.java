package saude.monitoramento.covid.model;

import java.util.Date;

public class Atendimentos {
	private int id_atendimento;
	private Date fimsintoma;
	private String Localtrabalho;
	private boolean  outroteste;
	private boolean atestadomedico;
	private Date  ini_atatestado;
	private Date fim_atestado;
	private String Desfeixo; //criar enum
	
	public int getId_atendimento() {
		return id_atendimento;
	}
	public void setId_atendimento(int id_atendimento) {
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
