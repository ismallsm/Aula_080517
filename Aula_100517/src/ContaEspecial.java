
public class ContaEspecial extends ContaBancaria {
	
	@Override
	public void saque(double valor) {
		valor -= (valor * 0.1);
		super.saque(valor);
	}
	
	@Override
	public void deposita(double valor) {
		valor += (valor * 0.1);
		super.deposita(valor);
	}
}
