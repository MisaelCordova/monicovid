package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Atendimentos;

@Repository
public interface AtendimentosRepository extends CrudRepository<Atendimentos, Long>{

}
