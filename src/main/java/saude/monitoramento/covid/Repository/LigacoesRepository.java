package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;

import saude.monitoramento.covid.model.Ligacoes;

public interface LigacoesRepository extends CrudRepository<Ligacoes, Long>{

}
