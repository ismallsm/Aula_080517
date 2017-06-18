import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Ex5 {

	public static int codigo_ASCII;	
	
	public static void main(String[] args) throws IOException {
		String mensagem = JOptionPane.showInputDialog(null, "Entre com uma mensagem a ser codificada", "Codificar",
				JOptionPane.INFORMATION_MESSAGE);
	
		codificar(mensagem);
	}
	
	public static void codificar (String param) throws IOException{		
		char b;	
		StringBuffer sb = new StringBuffer();
		for (int a = 0; a <= param.length()-1; a++){	
			codigo_ASCII = param.charAt(a)-15;
			b = (char)codigo_ASCII;
			sb.append(Character.toString(b));			
		}
		
		FileWriter arq = new FileWriter("d:\\mensagem_codificada.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
	    gravarArq.printf(sb.toString());
	    decodificar(sb.toString());
	    arq.close();
	}
	
	public static void decodificar (String param) throws IOException{
		char c;
		StringBuffer sb = new StringBuffer(param);
		for (int d = 0; d <= param.length()-1; d++){	
			codigo_ASCII = param.charAt(d)+15;
			c = (char)codigo_ASCII;
			sb.setCharAt(d, c);
		}
		
		FileWriter arq = new FileWriter("d:\\mesagem_decodificada.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    gravarArq.printf(sb.toString());

	    arq.close();
	}	

}
