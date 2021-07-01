package saude.monitoramento.covid.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import saude.monitoramento.covid.Repository.CondicaoRepository;
import saude.monitoramento.covid.Repository.NotificacaoRepository;
import saude.monitoramento.covid.Repository.PacienteRepository;
import saude.monitoramento.covid.Repository.SintomaRepository;
import saude.monitoramento.covid.model.Condicao;
import saude.monitoramento.covid.model.Notificacao;
import saude.monitoramento.covid.model.Paciente;
import saude.monitoramento.covid.model.Sintoma;

@Controller	
public class PacienteController {
		@Autowired
		private PacienteRepository pacienteRepository;
		@Autowired
		private SintomaRepository sintomaRepository;
		@Autowired
		private CondicaoRepository condicaoRepository;
		@Autowired
		private NotificacaoRepository notificacaoRepository;
		
		@RequestMapping(value = "/cadastrarPaciente", method=RequestMethod.GET)
		public String form() {
			return "formPaciente";
		}
	
		@RequestMapping(value = "/cadastrarPaciente", method=RequestMethod.POST)
		public String form(Paciente paciente,Sintoma sintoma,Condicao condicao, Notificacao notificacao) {
			pacienteRepository.save(paciente);
			sintoma.setPaciente(paciente);
			condicao.setPaciente(paciente);
			notificacao.setPaciente(paciente);
			sintomaRepository.save(sintoma);
			condicaoRepository.save(condicao);
			notificacaoRepository.save(notificacao);
			
			return "redirect:/cadastrarPaciente";
		}
		@RequestMapping("/pacientes")
		public ModelAndView listaPacientes() {
			ModelAndView mv = new ModelAndView("/index");
			Iterable<Paciente> pacientes=pacienteRepository.findAll();
			mv.addObject("pacientes",pacientes);
			return mv;
		}     
}
