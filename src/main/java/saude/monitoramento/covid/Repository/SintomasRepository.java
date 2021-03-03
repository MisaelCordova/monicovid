package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;

import saude.monitoramento.covid.model.Sintomas;

public interface SintomasRepository extends CrudRepository<Sintomas, Long>{

}
