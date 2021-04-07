package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Condicoes;

@Repository
public interface CondicoesRepository extends CrudRepository<Condicoes, Long>{

}
