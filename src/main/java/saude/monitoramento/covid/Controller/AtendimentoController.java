package saude.monitoramento.covid.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import saude.monitoramento.covid.Repository.AtendimentoRepository;
import saude.monitoramento.covid.Repository.LigacaoRepository;
import saude.monitoramento.covid.model.Atendimento;
import saude.monitoramento.covid.model.Ligacao;

@Controller
public class AtendimentoController {
		@Autowired
		private AtendimentoRepository atendimentoRepository;
		@Autowired
		private LigacaoRepository ligacaoRepository;
		
		@RequestMapping(value = "/cadastrarAtendimento", method =RequestMethod.GET)
		public String form() {
			return "formAtendimento";
		}
		//listar pacientes em algum lugar
		
		@RequestMapping(value ="/cadastrarAtendimento", method=RequestMethod.POST)
		public String form(Atendimento atendimento,Ligacao ligacao) {
			
			return "";
		}
		
}
