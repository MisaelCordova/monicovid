package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Sintoma;

@Repository
public interface SintomaRepository extends CrudRepository<Sintoma, Long>{

}
