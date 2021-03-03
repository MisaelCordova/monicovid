package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;

import saude.monitoramento.covid.model.Condicoes;

public interface CondicoesRepository extends CrudRepository<Condicoes, Long>{

}
