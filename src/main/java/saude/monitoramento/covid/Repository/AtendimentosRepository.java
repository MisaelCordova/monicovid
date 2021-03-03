package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;

import saude.monitoramento.covid.model.Atendimentos;

public interface AtendimentosRepository extends CrudRepository<Atendimentos, Long>{

}
