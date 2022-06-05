package cursoJava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalculoDatas {
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); /* Pega a data atual */
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("05-06-2022")); /* Definindo uma data */
		
		calendar.add(Calendar.DAY_OF_MONTH, 30); /* Data de hoje mais 30 dias*/
		
		System.out.println("Adiconando dias: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Adicionando mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));	
		
	}
}
