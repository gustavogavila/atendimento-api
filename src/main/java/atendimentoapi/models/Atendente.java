package atendimentoapi.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	@Column(nullable = false)
	private String nome;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(
		name = "atendente_disponibilidade",
		joinColumns = @JoinColumn(name = "atendente_id"), 
		inverseJoinColumns = @JoinColumn(name = "disponibilidade_id"))
	private List<Disponibilidade> disponibilidades = new ArrayList<>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(
		name = "atendente_servico",
		joinColumns = @JoinColumn(name = "atendente_id"), 
		inverseJoinColumns = @JoinColumn(name = "servico_id"))
	private List<Servico> servicos;

}
