package atendimentoapi.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "servico")
@Data
public class Servico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String nome;
	
	private String descricao;
}
