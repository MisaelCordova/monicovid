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


@Entity
public class Ligacao {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id_ligacao;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private String atendente;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private Date data;
	
	@NotBlank(message="Preenchimento Obrigatorio")
	private String sintomas;
	
	@NotBlank(message="Preenchumento Obrigatorio")
	private Evolucao evolucao;
	
	@ManyToOne (fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "id_atendimento")
	private Atendimento atendimentos;
	
	
	public Ligacao() {
		
	}
	
		
	
}
