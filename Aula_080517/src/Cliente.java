
public class Cliente {

	private String numeroRG;
	private String numeroCPF;
	private String endereco;
	private String nome;	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String numeroRG) {
		Cliente cli = new Cliente();
		cli.setNumeroRG(numeroRG);
	}
	
	public Cliente(String numeroRG, String numeroCPF, String endereco, String nome) {
		Cliente cli = new Cliente(numeroRG);
		this.numeroCPF = numeroCPF;
		this.endereco = endereco;
		this.nome = nome;
	}
	
	public String getNumeroRG() {
		return numeroRG;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
