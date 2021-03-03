package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;

import saude.monitoramento.covid.model.Pacientes;

public interface PacientesRepository extends CrudRepository<Pacientes, Long>{

}
