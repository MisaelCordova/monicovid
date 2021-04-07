package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Pacientes;

@Repository
public interface PacientesRepository extends CrudRepository<Pacientes, Long>{

}
