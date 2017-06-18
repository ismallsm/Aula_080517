import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		List<String> colecaoArray = new ArrayList<String>();
		LinkedList<String> colecaoLinked = new LinkedList<String>();
		long tamanho = 100000;
			
		LocalDateTime inicio = LocalDateTime.now();
		for(int i=0;i<=tamanho;i++){
			colecaoArray.add("String"+i);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		System.out.println("Tempo ArrayList: "+ChronoUnit.MILLIS.between(inicio, fim));
		
		LocalDateTime inicio2 = LocalDateTime.now();
		for(int i=0;i<=tamanho;i++){
			colecaoLinked.add("String"+i);
		}
		LocalDateTime fim2 = LocalDateTime.now();
		System.out.println("Tempo LinkedList: "+ChronoUnit.MILLIS.between(inicio2, fim2));
	}

}
