package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Ligacao;

@Repository
public interface LigacaoRepository extends CrudRepository<Ligacao, Long>{

}
