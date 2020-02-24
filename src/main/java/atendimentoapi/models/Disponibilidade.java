package atendimentoapi.models;

import java.time.LocalDateTime;

import atendimentoapi.models.enums.DiaSemana;
import lombok.Data;

@Data
public class Disponibilidade {
	
	private DiaSemana diaSemana;
	
	private LocalDateTime horaInicial;
	
	private LocalDateTime horaFinal;
}
