package semana.dominio;

public class Dia {
	private DiasDaSemana diasdasemana;

	public Dia(DiasDaSemana diasdasemana) {
		this.diasdasemana = diasdasemana;
	}

	@Override
	public String toString() {
		return "Dia: dia da semana= " + diasdasemana + ", dia da semana= " + diasdasemana.getNomeDia() + ", dia da semana valor= " + diasdasemana.valor;
	}

	
	
	
	
	

}
