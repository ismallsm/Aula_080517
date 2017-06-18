public class ContaBancaria{
	
	protected double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	protected double taxaDiaria = 1.0;
	
	public ContaBancaria(){
		
	}
	
	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente){
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
	}
	
	public void saque(double valor){
		saldo-=valor;
	}
	
	public void deposita(double valor){
		saldo+=valor;
	}
	public double getSaldo(){
		return saldo;
	}
	
	public double getTaxaBancaria() {
		return taxaDiaria;
	}
	
	public double getTaxaBancaria(int dias) {
		return dias * getTaxaBancaria();
	}
	
	public double getTaxaBancaria(int dias,int meses) {
		return getTaxaBancaria(dias+30*meses);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getEndCliente() {
		return endCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
}
