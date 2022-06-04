package cursoJava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread  extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando"); // teste da fila
		
		
		while (true) {
			Iterator iteracao = pilha_fila.iterator();
			synchronized (iteracao) { /* Bloquear o acesso a esta lista por outro processo */
				while (iteracao.hasNext()) { /* Enquando conter dados na lista */
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				/*
				 * Processar 10 mil notas fiscais
				 * Gerar uma lista enorme de pdf
				 * Gerar envio em massa de emails
				 * */
				
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());
				
				/* Processa e remove partindo para o proximo objeto*/
				iteracao.remove();
				
				try {				
					Thread.sleep(1000); /* Dá um tempo para descarga de memória */
				} catch (Exception e) {
					e.getStackTrace();
				}
			}
			try {			
				Thread.sleep(1000); /* Processou toda a lista dá um tempo para limpeza de memória*/
			} catch (Exception e ) {
				e.getStackTrace();
			}
		}
		}

	}
	
	
}
