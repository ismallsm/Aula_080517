import br.com.fiap.exe1.LogThread;
import br.com.fiap.exe2.Aeroporto;
import br.com.fiap.exe2.Aviao;
import br.com.fiap.exe3.Cores;

public class Main {

	public static void main(String[] args) {
		/*
		 * Exercicio I
		 */
//		LogThread logThread = new LogThread();				
//		logThread.logPrint.start();
//		logThread.logPrintTime.start();
//		logThread.start();

		/*
		 * Exercicio II
		 */
		
//	    Aeroporto aeroporto = new Aeroporto();
//	    Aviao tam = new Aviao("TAM 102", aeroporto);
//	    Aviao azul = new Aviao("AZUL 503", aeroporto);
//	    Aviao avianco = new Aviao("AVIANCO 609", aeroporto);
//	    
//	    aeroporto.start();
//	    tam.start();
//	    azul.start();
//	    avianco.start();
	    
	    /*
	     * Exercicio III
	     */
	    
	    for (Cores cor : Cores.values()) {
			System.out.println(cor.getNomeCor() + " - " + cor.getCodCor());
		}

		System.out.println(Cores.Branco.getCodCor());


	}

}
