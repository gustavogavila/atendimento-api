package atendimentoapi.repositories;

import org.springframework.data.repository.CrudRepository;

import atendimentoapi.models.Atendente;

public interface AtendenteRepository extends CrudRepository<Atendente, Long> {

}
