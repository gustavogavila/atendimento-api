package atendimentoapi.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import atendimentoapi.models.enums.DiaSemana;
import lombok.Data;

@Entity
@Table(name = "disponibilidade")
@Data
public class Disponibilidade implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private DiaSemana diaSemana;
	
	private LocalDateTime horaInicial;
	
	private LocalDateTime horaFinal;
}
