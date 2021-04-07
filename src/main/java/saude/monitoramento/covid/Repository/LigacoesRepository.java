package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Ligacoes;

@Repository
public interface LigacoesRepository extends CrudRepository<Ligacoes, Long>{

}
