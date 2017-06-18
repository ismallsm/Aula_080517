public class ContaPoupanca extends ContaBancaria {

	private int diaAniversario;

	public void saque(double valor){
		saldo-=valor-0.10;
	}
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente){
		super(nomeCliente, endCliente, cpfCliente);
	}

}