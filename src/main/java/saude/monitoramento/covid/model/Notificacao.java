
package saude.monitoramento.covid.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;


import com.sun.istack.NotNull;

@Entity
public class Notificacao {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_notificacao;
	
	private String tp_teste; //Botar enum se não vier do esus
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private String resultado; //Botar Enum se não vier do esus
	

	@NotNull
	private Date dt_notificacao;
	
	@NotNull
	private Date dt_teste;
	
	private String laudo; //trocar tipo para receber arquivo imagem e pdf
	
	private String laboratorio;
	
	@NotNull
	private Date Ini_sintomas;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = true)
	@JoinColumn(name = "id_paciente",nullable = true)
	private Paciente paciente; 
	
	
	
	public Notificacao() {
		
	}

	


	public Notificacao(String tp_teste, @NotBlank(message = "Preenchimento Obrigatorio") String resultado,
			Date dt_notificacao, Date dt_teste, String laudo, String laboratorio, Date ini_sintomas,
			Paciente paciente) {
		this.tp_teste = tp_teste;
		this.resultado = resultado;
		this.dt_notificacao = dt_notificacao;
		this.dt_teste = dt_teste;
		this.laudo = laudo;
		this.laboratorio = laboratorio;
		Ini_sintomas = ini_sintomas;
		this.paciente = paciente;
	}




	public Long getId_notificacao() {
		return id_notificacao;
	}



	public void setId_notificacao(Long id_notificacao) {
		this.id_notificacao = id_notificacao;
	}



	public String getTp_teste() {
		return tp_teste;
	}



	public void setTp_teste(String tp_teste) {
		this.tp_teste = tp_teste;
	}



	public String getResultado() {
		return resultado;
	}



	public void setResultado(String resultado) {
		this.resultado = resultado;
	}



	public Date getDt_notificacao() {
		return dt_notificacao;
	}



	public void setDt_notificacao(Date dt_notificacao) {
		this.dt_notificacao = dt_notificacao;
	}



	public Date getDt_teste() {
		return dt_teste;
	}



	public void setDt_teste(Date dt_teste) {
		this.dt_teste = dt_teste;
	}



	public String getLaudo() {
		return laudo;
	}



	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}



	public String getLaboratorio() {
		return laboratorio;
	}



	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}



	public Date getIni_sintomas() {
		return Ini_sintomas;
	}



	public void setIni_sintomas(Date ini_sintomas) {
		Ini_sintomas = ini_sintomas;
	}



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "Notificacao [id_notificacao=" + id_notificacao + ", tp_teste=" + tp_teste + ", resultado=" + resultado
				+ ", dt_notificacao=" + dt_notificacao + ", dt_teste=" + dt_teste + ", laudo=" + laudo
				+ ", laboratorio=" + laboratorio + ", Ini_sintomas=" + Ini_sintomas + ", paciente=" + paciente + "]";
	}





	
	
}
