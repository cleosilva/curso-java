package cursoJava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		
		String texto = "Cleo,curso java,80,90,70";
		
		String[] valoresArray = texto.split(",");
		
		for (int i = 0; i < valoresArray.length; i++) {
			System.out.println("Valores no array: " + valoresArray[i]);
			
		}
		System.out.println("--------------------------------------");
		
		/* Convertendo array em uma lista */
		List<String> lista = Arrays.asList(valoresArray);
		
		for (String valorString : lista) {
			System.out.println("Valores na lista: " + valorString);
			
		}
		System.out.println("--------------------------------------");
		
		/* Convertendo lista para array */
		String[] conversaoArray = lista.toArray(new String[5]);
		
		for (int i = 0; i < conversaoArray.length; i++) {
			System.out.println("Valores no array novamente: " + conversaoArray[i]);
		}
		
	}
}
