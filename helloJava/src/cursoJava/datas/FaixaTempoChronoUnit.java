package cursoJava.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FaixaTempoChronoUnit {
	public static void main(String[] args) {
		
		/* Pode ser usado para saber quantos dias uma data passou. Ex: Boleto vencido */
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-06-01"), LocalDate.now());
		
		System.out.println("Possui " + dias + " dias entre a faixa de data." );
		
	}
}
