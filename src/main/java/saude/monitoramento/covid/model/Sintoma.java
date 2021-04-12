package saude.monitoramento.covid.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;




@Entity
public class Sintoma {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_sintoma;
	
	private boolean dorgarganta;
	private boolean dispineia;
	private boolean febre;
	private boolean dorcabeca;
	private boolean disturgustivo;
	private boolean coriza;
	private boolean assintomatico;
	private String outros;
	
	@OneToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="id_paciente", nullable = false)
	private Paciente paciente;
	
	public Sintoma() {
		
	}
	
	
	public Sintoma(boolean dorgarganta, boolean dispineia, boolean febre, boolean dorcabeca, boolean disturgustivo,
			boolean coriza, boolean assintomatico, String outros) {
		super();
		this.dorgarganta = dorgarganta;
		this.dispineia = dispineia;
		this.febre = febre;
		this.dorcabeca = dorcabeca;
		this.disturgustivo = disturgustivo;
		this.coriza = coriza;
		this.assintomatico = assintomatico;
		this.outros = outros;
	}


	public long getId_sintoma() {
		return id_sintoma;
	}
	public void setId_sintoma(long id_sintoma) {
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

	@Override
	public String toString() {
		return "Sintoma [id_sintoma=" + id_sintoma + ", dorgarganta=" + dorgarganta + ", dispineia=" + dispineia
				+ ", febre=" + febre + ", dorcabeca=" + dorcabeca + ", disturgustivo=" + disturgustivo + ", coriza="
				+ coriza + ", assintomatico=" + assintomatico + ", outros=" + outros + "]";
	}
	
	
   
}
