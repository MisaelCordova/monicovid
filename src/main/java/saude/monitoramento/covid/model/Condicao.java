package saude.monitoramento.covid.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Condicao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_condicoes;
	
	
	private boolean DRCD; //Doenças Resporatórias Crônicas descompensadas
	
	
	private boolean DCC;  //Doenças Cardíacas Crônicas
	
	
	private boolean diabetes; 
	
	
	private boolean DRCEA; //Doenças Renais Crônicas em estagio avançado
	

	private boolean imunosupresssao;
	

	private boolean obesidade;
	

	private boolean puerpera;
	

	private boolean gestante;
	
	private String outras;
	
	@OneToOne(fetch = FetchType.LAZY,optional = true)
	@JoinColumn(name="id_paciente",nullable = false)
	private Paciente paciente;
	
	
	
	public Condicao() {
	
	}
	

	public Condicao(boolean dRCD, boolean dCC, boolean diabetes, boolean dRCEA, boolean imunosupresssao,
			boolean obesidade, boolean puerpera, boolean gestante, String outras) {
		super();
		DRCD = dRCD;
		DCC = dCC;
		this.diabetes = diabetes;
		DRCEA = dRCEA;
		this.imunosupresssao = imunosupresssao;
		this.obesidade = obesidade;
		this.puerpera = puerpera;
		this.gestante = gestante;
		this.outras = outras;
	}

	public Long getId_condicoes() {
		return id_condicoes;
	}

	public void setId_condicoes(Long id_condicoes) {
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
	public String getOutras() {
		return outras;
	}
	public void SetOutras(String outras) {
		this.outras = outras;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
}

