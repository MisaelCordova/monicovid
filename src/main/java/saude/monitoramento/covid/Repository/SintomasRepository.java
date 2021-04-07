package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Sintomas;

@Repository
public interface SintomasRepository extends CrudRepository<Sintomas, Long>{

}
