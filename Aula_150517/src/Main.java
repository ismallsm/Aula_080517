import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {

		ContaPoupanca conta1 = new ContaPoupanca("José", "123", "R. X");
		ContaPoupanca conta2 = new ContaPoupanca("Peter", "123", "R. X");
		
		System.out.println(conta1.equals(conta2));
		
		
		try {
			conta1.deposita(70);
			conta1.saque(60,  LocalDate.of(2016, Month.MAY, 10));
		} catch (ContaException e) {
			e.printStackTrace();
		}
	}

}
