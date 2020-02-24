package atendimentoapi.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "atendente")
@Data
public class Atendente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String nome;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "atendente_disponibilidade")
	private List<Disponibilidade> disponibilidades = new ArrayList<>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "atendente_servico")
	private List<Servico> servicos;

}
