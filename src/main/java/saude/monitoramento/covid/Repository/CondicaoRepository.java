package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Condicao;

@Repository
public interface CondicaoRepository extends CrudRepository<Condicao, Long>{

}
