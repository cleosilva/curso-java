package cursoJava.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSON {
	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Maria");
		usuario1.setCpf("90090090090");
		usuario1.setLogin("pretaMaria");
		usuario1.setSenha("123");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("Samuka");
		usuario2.setCpf("80080080080");
		usuario2.setLogin("samukinha");
		usuario2.setSenha("123");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Cleo\\git\\repository2\\helloJava\\src\\cursoJava\\arquivos\\filejson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
	}
}
