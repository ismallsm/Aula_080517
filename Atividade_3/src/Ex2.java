import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex2 {
	
	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.of(2012, 9, 10, 12, 00);
		System.out.println(agora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd-MM-uu HH:mm:ss")));
		System.out.println(agora.format(DateTimeFormatter.ofPattern("E")));
		System.out.println(agora.format(DateTimeFormatter.ofPattern("yyyy")));
		System.out.println(agora.format(DateTimeFormatter.ofPattern("G")));
	}
}
