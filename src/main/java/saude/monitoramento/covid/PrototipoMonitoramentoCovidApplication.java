package saude.monitoramento.covid;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import saude.monitoramento.covid.Repository.CondicaoRepository;
import saude.monitoramento.covid.Repository.LigacaoRepository;
import saude.monitoramento.covid.Repository.NotificacaoRepository;
import saude.monitoramento.covid.Repository.PacienteRepository;
import saude.monitoramento.covid.Repository.SintomaRepository;
import saude.monitoramento.covid.model.Atendimento;
import saude.monitoramento.covid.model.Condicao;
import saude.monitoramento.covid.model.Desfeixo;
import saude.monitoramento.covid.model.Evolucao;
import saude.monitoramento.covid.model.Ligacao;
import saude.monitoramento.covid.model.Notificacao;
import saude.monitoramento.covid.model.Paciente;
import saude.monitoramento.covid.model.Sintoma;


@SpringBootApplication
public class PrototipoMonitoramentoCovidApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototipoMonitoramentoCovidApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner testeMap(PacienteRepository pacienteRepository,
										SintomaRepository sintomaRepository,
										CondicaoRepository condicaoRepository,
										NotificacaoRepository notificacaoRepository,
										LigacaoRepository ligacaoRepository) {
	return args ->{
		
		
		Locale locale = new java.util.Locale("pt","BR");
		String nasc = "2000-27-06";
		String noti = "2021-13-04";
		String sinto = "2021-10-04 08:30";
		 Date date = new SimpleDateFormat("yyyy-dd-MM",locale).parse(nasc);
		 Date not = new SimpleDateFormat("yyyy-dd-MM",locale).parse(noti);
		 Date sint = new SimpleDateFormat("yyyy-dd-MM hh:mm",locale).parse(sinto);
		 
		Paciente paciente = new Paciente(true, 704608755985930L, date, "Misael Fernandes Córdova", "Jardim das Avenidas", 48998145731L, true, 1133135897L,"Elenice Fernandes Córdova", 'M');
		
		Condicao condicao = new Condicao(false, false, false, false, false, false, false, false, "Renite");// chama novamente o contrutor com novo atributo outra
		
		Sintoma sintoma = new Sintoma(false, false, false, false, false, false, true, null);
		Atendimento atendimento = new Atendimento(null, "Bom Pastor", false, false, null, null,Desfeixo.Monitorado, paciente, null);
		
		condicao.setPaciente(paciente);
		
		sintoma.setPaciente(paciente);
		
		
		paciente.setCondicoes(condicao);
		paciente.setSintomas(sintoma);
		paciente.setAtendimentos(atendimento);

		
		pacienteRepository.save(paciente);
		
		notificacaoRepository.save(new Notificacao("PCR", "Negativo", not, not, "Anexo", "UPA", sint, paciente));
		notificacaoRepository.save(new Notificacao("RT", "Positivo", not, not, "anexo2", "Rafael", sint, paciente));
		ligacaoRepository.save(new Ligacao("Misael", "Sucesso", sint, "Nada", Evolucao.Casa, atendimento));// chamar novamente o construtor com campo status
	
	

		
	};
	}

}
