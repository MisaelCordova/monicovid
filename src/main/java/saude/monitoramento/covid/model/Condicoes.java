package saude.monitoramento.covid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Condicoes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_condicoes;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean DRCD; //Doenças Resporatórias Crônicas descompensadas
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean DCC;  //Doenças Cardíacas Crônicas
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean diabetes; 
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean DRCEA; //Doenças Renais Crônicas em estagio avançado
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean imunosupresssao;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean obesidade;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean puerpera;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private boolean gestante;
	
	public long getId_condicoes() {
		return id_condicoes;
	}
	public void setId_condicoes(long id_condicoes) {
		this.id_condicoes = id_condicoes;
	}
	public boolean isDRCD() {
		return DRCD;
	}
	public void setDRCD(boolean dRCD) {
		DRCD = dRCD;
	}
	public boolean isDCC() {
		return DCC;
	}
	public void setDCC(boolean dCC) {
		DCC = dCC;
	}
	public boolean isDiabetes() {
		return diabetes;
	}
	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}
	public boolean isDRCEA() {
		return DRCEA;
	}
	public void setDRCEA(boolean dRCEA) {
		DRCEA = dRCEA;
	}
	public boolean isImunosupresssao() {
		return imunosupresssao;
	}
	public void setImunosupresssao(boolean imunosupresssao) {
		this.imunosupresssao = imunosupresssao;
	}
	public boolean isObesidade() {
		return obesidade;
	}
	public void setObesidade(boolean obesidade) {
		this.obesidade = obesidade;
	}
	public boolean isPuerpera() {
		return puerpera;
	}
	public void setPuerpera(boolean puerpera) {
		this.puerpera = puerpera;
	}
	public boolean isGestante() {
		return gestante;
	}
	public void setGestante(boolean gestante) {
		this.gestante = gestante;
	}
	
}

