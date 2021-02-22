package saude.monitoramento.covid.model;

public class Sintomas {
	private int id_sintoma;
	private boolean dorgarganta;
	private boolean dispineia;
	private boolean febre;
	private boolean dorcabeca;
	private boolean disturgustivo;
	private boolean coriza;
	private boolean assintomatico;
	private String outros;
	
	public int getId_sintoma() {
		return id_sintoma;
	}
	public void setId_sintoma(int id_sintoma) {
		this.id_sintoma = id_sintoma;
	}
	public boolean isDorgarganta() {
		return dorgarganta;
	}
	public void setDorgarganta(boolean dorgarganta) {
		this.dorgarganta = dorgarganta;
	}
	public boolean isDispineia() {
		return dispineia;
	}
	public void setDispineia(boolean dispineia) {
		this.dispineia = dispineia;
	}
	public boolean isFebre() {
		return febre;
	}
	public void setFebre(boolean febre) {
		this.febre = febre;
	}
	public boolean isDorcabeca() {
		return dorcabeca;
	}
	public void setDorcabeca(boolean dorcabeca) {
		this.dorcabeca = dorcabeca;
	}
	public boolean isDisturgustivo() {
		return disturgustivo;
	}
	public void setDisturgustivo(boolean disturgustivo) {
		this.disturgustivo = disturgustivo;
	}
	public boolean isCoriza() {
		return coriza;
	}
	public void setCoriza(boolean coriza) {
		this.coriza = coriza;
	}
	public boolean isAssintomatico() {
		return assintomatico;
	}
	public void setAssintomatico(boolean assintomatico) {
		this.assintomatico = assintomatico;
	}
	public String getOutros() {
		return outros;
	}
	public void setOutros(String outros) {
		this.outros = outros;
	}
	
   
}
