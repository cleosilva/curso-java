package cursoJava.datas;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DataNovaApiJava {
	public static void main(String[] args) {
		/* Nova Api de data a partir do Java 8 */
		
		// Pegando a data atual
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		// Pegando a hora atual
		LocalTime horaAtual = LocalTime.now();
		System.out.println(horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		// Pegando a data e hora atual
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println(dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
	}
}
