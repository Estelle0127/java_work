import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
public static void main(String[] args) {
	try {
		Class.forName("org.gjt.mm.mysql.Driver");
		System.out.println("����̹� ã�Ҵ�.");
		
		String url ="jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "apmsetup";
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("���� ����!");
	} catch (ClassNotFoundException e) {
		System.out.println("����̹� �˻� ����!");
		e.printStackTrace();//���� �κ� �����ϴ� ���.
	} catch (SQLException e) {
		System.err.println("���ӽ���");
		e.printStackTrace();
	}
}
}
