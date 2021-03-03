package saude.monitoramento.covid.Repository;

import org.springframework.data.repository.CrudRepository;

import saude.monitoramento.covid.model.Notificacoes;

public interface NotificacoesRepository extends CrudRepository<Notificacoes, Long>{

}
