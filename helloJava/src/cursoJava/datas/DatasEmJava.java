package cursoJava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/06/2022");
		
		Date dataAtualHoje = simpleDateFormat.parse("05/06/2022");
		
		/* Usando o after para verificar uma data posterior a data atual*/
		if (dataVencimentoBoleto.after(dataAtualHoje)) { 
			System.out.println("Boleto não vencido.");
		} else {
			System.out.println("Boleto vencido.");
		}
		
		/* Usando o before para verificar uma data anterior a data atual */
		if (dataVencimentoBoleto.before(dataAtualHoje)) { 
			System.out.println("Boleto vencido.");
		} else {
			System.out.println("Boleto não vencido.");
		}
	}
}
