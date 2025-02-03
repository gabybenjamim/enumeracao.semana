package semana.dominio;

public enum DiasDaSemana {
	DOMINGO(1, "Domingo"), 
	SEGUNDA(2, "Segunda-Feira"),
	TERÇA(3, "Terça-Feira"),
	QUARTA(4, "Quarta-Feira"),
	QUINTA(5, "Quinta-Feira"),
	SEXTA(6, "Sexta-Feira"), 
	SÁBADO(7, "Sábado");
	
	public final int valor;
	public final String nomeDia;
	
	DiasDaSemana(int valor, String nomeDia) {
		this.valor = valor;
		this.nomeDia = nomeDia;
	}
	
	public String getNomeDia() {
		return nomeDia;
	}

}
