package saude.monitoramento.covid.model;

public class Condicoes {
	private int id_condicoes;
	private boolean DRCD; //Doenças Resporatórias Crônicas descompensadas
	private boolean DCC;  //Doenças Cardiácas Crônicas
	private boolean diabetes; 
	private boolean DRCEA; //Doenças Renais Crônicas em estagio avançado
	private boolean imunosupresssao;
	private boolean obesidade;
	private boolean puerpera;
	private boolean gestante;
	
	public int getId_condicoes() {
		return id_condicoes;
	}
	public void setId_condicoes(int id_condicoes) {
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

