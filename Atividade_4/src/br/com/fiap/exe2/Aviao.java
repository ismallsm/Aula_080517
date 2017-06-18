package br.com.fiap.exe2;
public class Aviao extends Thread {
	private String voo;
	private Aeroporto local;

	public Aviao(String nomeVoo, Aeroporto aeroporto) {
		this.voo = nomeVoo;
		this.local = aeroporto;
	}

	public void decolar() {
		System.out.println(voo + " decolando");
	}

	public void voar() {
		System.out.println(voo + " no ar");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(voo + " autorização para aterrissar");
	}

	public void aterrissar() {
		System.out.println(voo + " autorização concedida. Aterrisando");
	}

	@Override
	public void run() {
		local.aguardarPistaDisponivel();
		decolar();
		voar();

		local.aguardarPistaDisponivel();
		aterrissar();
	}
}
