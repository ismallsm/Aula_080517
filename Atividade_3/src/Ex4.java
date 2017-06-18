import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João Garcia",  20, 'M', "AIK Enterprises");
		Pessoa pessoa2 = new Pessoa("Maria Martins",  44, 'F', "Simples");
		Pessoa pessoa3 = new Pessoa("Henrique Fernando",  43, 'M', "AIK Enterprises");
		Pessoa pessoa4 = new Pessoa("Inácio Luís",  33, 'M', "Magazine André");
		Pessoa pessoa5 = new Pessoa("Fernando Ferreira",  87, 'M', "Casas Recife");
		
		ArrayList<Pessoa> listPessoa = new ArrayList<Pessoa>();
		listPessoa.add(pessoa1);
		listPessoa.add(pessoa2);
		listPessoa.add(pessoa3);
		listPessoa.add(pessoa4);
		listPessoa.add(pessoa5);
		
		
		//a
		Collections.shuffle(listPessoa);
		Random r = new Random();
		Pessoa rdm = listPessoa.get(r.nextInt(listPessoa.size()));
		listPessoa.remove(rdm);
		
		//b
		listPessoa.sort(new Comparator<Pessoa>() {
				@Override
			    public int compare(Pessoa o1, Pessoa o2) {
			        // write comparison logic here like below , it's just a sample
			        return o1.getNome().compareTo(o2.getNome());
			    }
			});
		 
		//c
		Collections.reverse(listPessoa);
		
	}
}
