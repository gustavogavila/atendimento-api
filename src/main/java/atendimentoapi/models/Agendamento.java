package atendimentoapi.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Agendamento {

	private LocalDateTime dataHoraInicio;

	private LocalDateTime dataHoraFim;

	private Integer avaliacaoCliente;
	
	private Cliente cliente;
	
	private Atendente atendente;
}
