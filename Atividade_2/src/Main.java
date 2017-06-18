public class Main {
	public static void main(String[] args) {
		/*
		 * Exercício 2.
		 */
		EquipamentoEletronico tablet = new Tablet();
		
		EquipamentoEletronico smartphone = new Smartphone();
		
		Equipamento equipamento = new Equipamento();
		
		Object objeto = new Object();
		
		Movel movel = new Movel();
		
		Tablet tablet2 = new Tablet();
		
		Smartphone smartphone2 = new Smartphone();
		
		//objeto para equipamento conversão implícita
		objeto = equipamento;
		System.out.println(objeto);
		
		//objeto para móvel  conversão implícita
		objeto=movel;
		System.out.println(objeto);
		
		//equipamento para tablet2 conversão implícita
		equipamento=tablet2;
		System.out.println(equipamento);
		
		//equipamento para smartphone2 conversão implícita
		equipamento=smartphone2;
		System.out.println(equipamento);
		
		//smartphone para tablet conversão implícita
		smartphone=tablet;
		System.out.println(smartphone);
		
		//smartphone2 para tablet2 conversão impossível (erro de compilação)
		//smartphone2=tablet2;
		//System.out.println(smartphone2);
		
		//equipamento para tablete conversão explícita
		equipamento=(Equipamento) tablet;
		System.out.println(equipamento);
		
		//movel para tablete conversão explícita
		movel=(Movel) tablet;
		System.out.println(movel);
		
		//tablet para equipamento conversão explícita
		tablet=(EquipamentoEletronico) equipamento;
		System.out.println(tablet);
		
		
		/*
		 * Exercício 3.
		 * 
		 * A. A classe ChowChow extends a classe Cachorro
		 * lodo o instanceof é verdadeiro
		 */
		ChowChow chowChow = new ChowChow();
		Boolean valor = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: "+valor);
		
		/*
		 * B. A classe Cachorro não extends a classe ChowChow
		 * logo o instanceof é falso
		 */
		Cachorro cachorro = new Cachorro();
		Boolean valor2 = cachorro instanceof ChowChow;
		System.out.println("Verdadeiro ou Falso 2: "+valor2);
	}
}