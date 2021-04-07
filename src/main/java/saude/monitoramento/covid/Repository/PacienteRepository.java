package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Paciente;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long>{
	
}
