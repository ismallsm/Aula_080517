
public class Main extends ContaEspecial{

	public static void main(String[] args) {
		
		/* Calcule o máximo, o mínimo, a soma e a média de um Array de 
		 * inteiros aleatórios (ex: {3, 5, 1, 9})
		 */
		int[] valores = {3,5,10,9};
		
		float media = 0;
		int max = valores[0];
		int min = valores[0];
		int soma = 0;
		
		for(int i:valores){
			soma = soma + i;
			
			if(i > max){
				max = i;
			}
			
			if(i < min){
				min = i;
			}
			
		}
		
		media = soma / valores.length;
		
		System.out.println("Média:"+media);
		System.out.println("Maximo:"+max);
		System.out.println("Minimo:"+min);
		System.out.println("soma:"+soma);
		
		/*Crie uma classe ContaEspecial onde nas operações de saque e depósito sejam descontados 10% do valor 
		 *a ser depositado ou sacado. Utilize a herançada classe ContaBancaria do exemplo anterior.
		 */
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.deposita(1000.0);
		contaEspecial.saque(400.0);
		
		System.out.println("Saldo: "+contaEspecial.getSaldo());
	}
	
}
