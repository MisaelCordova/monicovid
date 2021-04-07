package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import saude.monitoramento.covid.model.Notificacoes;

@Repository
public interface NotificacoesRepository extends CrudRepository<Notificacoes, Long>{

}
