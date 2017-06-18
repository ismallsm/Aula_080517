import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.WeakHashMap;

public class Main {
	/*
	 * Exercicio III
	 */
	public static void main(String[] args) {
		long tamanho = 1000000;
		int entrada = 500000;
		/*
		 * a. ArrayList e LinkedList
		 */
		List<String> colecaoArrayList = new ArrayList<String>();
		LocalDateTime inicioArrayList = LocalDateTime.now();
		for(int i=0;i<=tamanho;i++){
			colecaoArrayList.add(""+i);
		}
		LocalDateTime fimArrayList = LocalDateTime.now();
		System.out.println("Tempo ArrayList: "+ChronoUnit.MILLIS.between(inicioArrayList, fimArrayList));
		LocalDateTime inicioBuscaArrayList = LocalDateTime.now();
		System.out.println(colecaoArrayList.get(entrada));
		LocalDateTime fimBuscaArrayList = LocalDateTime.now();
		System.out.println("Tempo de busca ArrayList: "+ChronoUnit.MILLIS.between(inicioBuscaArrayList, fimBuscaArrayList));
		
		LinkedList<String> colecaoLinkedList = new LinkedList<String>();
		LocalDateTime inicioLinkedList = LocalDateTime.now();
		for(int i=0;i<=tamanho;i++){
			colecaoLinkedList.add(""+i);
		}
		LocalDateTime fimLinkedList = LocalDateTime.now();
		System.out.println("Tempo LinkedList: "+ChronoUnit.MILLIS.between(inicioLinkedList, fimLinkedList));
		LocalDateTime inicioBuscaLinkedList = LocalDateTime.now();
		System.out.println(colecaoLinkedList.get(entrada));
		LocalDateTime fimBuscaLinkedList = LocalDateTime.now();
		System.out.println("Tempo de busca LinkedList: "+ChronoUnit.MILLIS.between(inicioBuscaLinkedList, fimBuscaLinkedList));
		
		/*
		 * b. Stack e HashSet
		 */
		Set<String> colecaoHashSet = new HashSet<String>();
		LocalDateTime inicioHashSet = LocalDateTime.now();
		for(int i=0;i<=tamanho;i++){
			colecaoHashSet.add(""+i);
		}
		LocalDateTime fimHashSet = LocalDateTime.now();
		System.out.println("Tempo HashSet: "+ChronoUnit.MILLIS.between(inicioHashSet, fimHashSet));
		LocalDateTime inicioBuscaHashSet = LocalDateTime.now();
		System.out.println(colecaoHashSet.contains("500"));
		LocalDateTime fimBuscaHashSet = LocalDateTime.now();
		System.out.println("Tempo de busca HashSet: "+ChronoUnit.MILLIS.between(inicioBuscaHashSet, fimBuscaHashSet));
		
		SortedSet<String> colecaoTreeSet= new TreeSet<String>();
		LocalDateTime inicioTreeSet = LocalDateTime.now();
		for(int i=0;i<=tamanho;i++){
			colecaoTreeSet.add(""+i);
		}
		LocalDateTime fimTreeSet = LocalDateTime.now();
		System.out.println("Tempo TreeSet: "+ChronoUnit.MILLIS.between(inicioTreeSet, fimTreeSet));
		LocalDateTime inicioBuscaTreeSet = LocalDateTime.now();
		System.out.println(colecaoTreeSet.contains("500"));
		LocalDateTime fimBuscaTreeSet = LocalDateTime.now();
		System.out.println("Tempo de busca TreeSet: "+ChronoUnit.MILLIS.between(inicioBuscaTreeSet, fimBuscaTreeSet));
		
		/*
		 * c. HashMap e WeakHashMap
		 */
		Map<Integer, String> colecaoHashMap = new HashMap<>();
		LocalDateTime inicioHashMap = LocalDateTime.now();
		for(int i=0;i<=tamanho;i++){
			colecaoHashMap.put(i,""+i);
		}
		LocalDateTime fimHashMap = LocalDateTime.now();
		System.out.println("Tempo HashMap: "+ChronoUnit.MILLIS.between(inicioHashMap, fimHashMap));
		LocalDateTime inicioBuscaHashMap = LocalDateTime.now();
		System.out.println(colecaoHashMap.get(entrada));
		LocalDateTime fimBuscaHashMap = LocalDateTime.now();
		System.out.println("Tempo de busca HashMap: "+ChronoUnit.MILLIS.between(inicioBuscaHashMap, fimBuscaHashMap));
		
		Map<Integer, String> colecaoWeakHashMap = new WeakHashMap<>();
		LocalDateTime inicioWeakHashMap = LocalDateTime.now();
		for(int i=0;i<=tamanho;i++){
			colecaoWeakHashMap.put(i,""+i);
		}
		LocalDateTime fimWeakHashMap = LocalDateTime.now();
		System.out.println("Tempo WeakHashMap: "+ChronoUnit.MILLIS.between(inicioWeakHashMap, fimWeakHashMap));
		LocalDateTime inicioBuscaWeakHashMap = LocalDateTime.now();
		System.out.println(colecaoWeakHashMap.get(entrada));
		LocalDateTime fimBuscaWeakHashMap = LocalDateTime.now();
		System.out.println("Tempo de busca WeakHashMap: "+ChronoUnit.MILLIS.between(inicioBuscaWeakHashMap, fimBuscaWeakHashMap));
	}

}
