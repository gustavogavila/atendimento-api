package atendimentoapi.models.enums;

import java.util.ArrayList;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class DiaSemanaConverter implements AttributeConverter<DiaSemana, String> {

	@Override
	public String convertToDatabaseColumn(DiaSemana diaSemana) {
		if (diaSemana == null) {
			return null;
		}

		return diaSemana.getDescricao();
	}

	@Override
	public DiaSemana convertToEntityAttribute(String descricao) {
		if (descricao == null) {
			return null;
		}

		ArrayList<DiaSemana> descricoesDias = new ArrayList<>();
		for (DiaSemana dia : DiaSemana.values()) {
			descricoesDias.add(dia);
		}

		return descricoesDias.stream().filter(d -> d.getDescricao().equals(descricao)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}
