package atendimentoapi.models.enums;

public enum DiaSemana {
	SEGUNDA("Segunda-Feira"), TERCA("Terça-Feira"), QUARTA("Quarta-Feira"), QUINTA("Quinta-Feira"),
	SEXTA("Sexta-Feira"), SABADO("Sábado"), DOMINGO("Domingo");

	private String descricao;

	DiaSemana(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
