package atendimentoapi.repositories;

import org.springframework.data.repository.CrudRepository;

import atendimentoapi.models.Agendamento;

public interface AgendamentoRepository extends CrudRepository<Agendamento, Long>{

}
