import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends ContaBancaria {

	private int diaAniversario;

	public void saque(double valor) throws ContaException{
		
		if(valor > saldo){
			throw new ContaException("Saldo Insuficiente!");
		}
		
		saldo-=valor-0.10;
	}
	
	public void saque(double valor, LocalDate dataConta) throws ContaException{
		if(valor > saldo){
			throw new ContaException("Saldo Insuficiente!");
		}
		LocalDate agora = LocalDate.now();
		long anos = ChronoUnit.YEARS.between(dataConta, agora);
		long meses = ChronoUnit.MONTHS.between(dataConta, agora);

		
		if(meses > 12){
			saldo-=valor - (valor * 0.01);	
		}
	}
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente){
		super(nomeCliente, endCliente, cpfCliente);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof ContaPoupanca){
			ContaPoupanca conta = (ContaPoupanca) obj;
			return conta.cpfCliente.equals(cpfCliente);
		}else{
			return false;
		}
	}

}