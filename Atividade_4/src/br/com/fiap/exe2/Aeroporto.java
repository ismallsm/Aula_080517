package br.com.fiap.exe2;
public class Aeroporto extends Thread {
	private boolean pista = true;

	public boolean getPistaDisponivel() {
		return this.pista;
	}

	public synchronized void aguardarPistaDisponivel() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void alteraEstadoPista() {
		pista = !pista;

		if (pista) {
			System.out.println("Disponivel");
			notify();
		} else {
			System.out.println("Fechada");
		}
	}

	@Override
	public void run() {
		while (true) {
			alteraEstadoPista();

			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}