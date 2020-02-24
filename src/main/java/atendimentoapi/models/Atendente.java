package atendimentoapi.models;

import java.util.List;

import lombok.Data;

@Data
public class Atendente {
	
	private String nome;
	
	private List<Disponibilidade> disponibilidades;
	
	private List<Servico> servicos;
}
