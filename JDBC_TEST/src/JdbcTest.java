import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
public static void main(String[] args) {
	try {
		Class.forName("org.gjt.mm.mysql.Driver");
		System.out.println("드라이버 찾았다.");
		
		String url ="jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "apmsetup";
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("접속 성공!");
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버 검색 실패!");
		e.printStackTrace();//에러 부분 추적하는 기능.
	} catch (SQLException e) {
		System.err.println("접속실패");
		e.printStackTrace();
	}
}
}
