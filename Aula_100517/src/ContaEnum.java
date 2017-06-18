
public enum ContaEnum {
	POTENCIAL(400_000, 500_000),
	MEDIO(200_00,399_000),
	BAIXO(0 , 199_000);
	
	private double faixaInicial;
	private double faixaFinal;
	
	
	ContaEnum(double faixaInicial, double faixaFinal){
		this.faixaInicial = faixaInicial;
		this.faixaFinal = faixaFinal;
	}
	
	
	public boolean isCompatible(ContaPoupanca conta) {
		if(conta.saldo >= faixaInicial && conta.saldo <= faixaFinal){
			return true;
		}
		return false;
	}


	public double getFaixaInicial() {
		return faixaInicial;
	}


	public double getFaixaFinal() {
		return faixaFinal;
	}


	public void setFaixaInicial(double faixaInicial) {
		this.faixaInicial = faixaInicial;
	}


	public void setFaixaFinal(double faixaFinal) {
		this.faixaFinal = faixaFinal;
	}
	
}
