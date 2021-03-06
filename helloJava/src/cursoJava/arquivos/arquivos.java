package cursoJava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class arquivos {
	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Mariana");
		pessoa1.setIdade(30);
		pessoa1.setEmail("pessoa1@email.com");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Lucas");
		pessoa2.setIdade(42);
		pessoa2.setEmail("pessoa2@email.com");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Luana");
		pessoa3.setIdade(25);
		pessoa3.setEmail("pessoa3@email.com");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = new File("C:\\Users\\Cleo\\git\\repository2\\helloJava\\src\\cursoJava\\arquivos\\arquivo.csv");
		
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() +";"+ p.getIdade() + ";" + p.getEmail()+ "\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}
}
