package atendimentoapi.repositories;

import org.springframework.data.repository.CrudRepository;

import atendimentoapi.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
