package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Notificacao;

@Repository
public interface NotificacaoRepository extends CrudRepository<Notificacao, Long>{

}
