package semana.teste;

import semana.dominio.Dia;
import semana.dominio.DiasDaSemana;

public class SemanaTeste {

	public static void main(String[] args) {
		Dia dia1 = new Dia (DiasDaSemana.DOMINGO);
		Dia dia2 = new Dia (DiasDaSemana.SEGUNDA);
		Dia dia3 = new Dia (DiasDaSemana.TERÇA);
		Dia dia4 = new Dia (DiasDaSemana.QUARTA);
		Dia dia5 = new Dia (DiasDaSemana.QUINTA);
		Dia dia6 = new Dia (DiasDaSemana.SEXTA);
		Dia dia7 = new Dia (DiasDaSemana.SÁBADO);

	System.out.println(dia1);
	System.out.println(dia2);
	System.out.println(dia3);
	System.out.println(dia4);
	System.out.println(dia5);
	System.out.println(dia6);
	System.out.println(dia7);
	}

}
