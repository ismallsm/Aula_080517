import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class Main {
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement ps;
	
	private static String url = "jdbc:mysql://localhost:3306/vendas?useSSL=false";
	
	public static void main(String[] args) {
		try {
			conn = DriverManager.getConnection(url, "root", "admin");
			st = conn.createStatement();
			
			String nome="I";
			String email="i";
			
			st.execute("INSERT INTO CLIENTES (NOME, EMAIL)"
					+ "VALUES ('"+nome+"','"+email+"')");
			
			st.close();
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
