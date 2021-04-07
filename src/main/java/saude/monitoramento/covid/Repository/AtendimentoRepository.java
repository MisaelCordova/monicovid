package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Atendimento;

@Repository
public interface AtendimentoRepository extends CrudRepository<Atendimento, Long>{

}
