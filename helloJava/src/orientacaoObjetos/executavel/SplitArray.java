package orientacaoObjetos.executavel;

public class SplitArray {
	public static void main(String[] args) {
		
		String texto = "Cleo,curso java,80,90,70";
		
		String[] valoresArray = texto.split(",");
		
		for (int i = 0; i < valoresArray.length; i++) {
			System.out.println(valoresArray[i]);
		}
		
		
	}
}
