import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcTest3 {
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//throws 하면 Jbm에서 다 처리해줌.

	Class.forName("org.gjt.mm.mysql.Driver");
	out.println(" 검색성공");

	String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
	String user = "root";
	String password = "apmsetup";
	conn = DriverManager.getConnection(url, user, password);
	
	String sql = "insert into saram(id, name, age) values(?,?,?)";

	out.print("성 : ");
	String firstname = scan.next();	
	out.print("이름 : ");
	String iname = scan.next();
	out.print("나이 : ");
	int iage = scan.nextInt();
	
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, firstname);//1번째 물음표
	pstmt.setString(2, iname);
	pstmt.setInt(3, iage);
	
	int res = pstmt.executeUpdate();
	
	
	//
	if(res != 0){
		System.out.println(" 처리 완료");
	}else {
		System.out.println(" 처리 실패");
	}
	
	if(pstmt!=null) pstmt.close();
	if(conn!=null) conn.close();
	
	}
}
//id, name, age를 화면에서 입력받아서 db에 저장.
//저장 후 자동으로 내용을 출력 하는 프로그램.
