import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest2 {
	private static Connection conn = null;
	private static ResultSet rs = null;
	private static Statement stmt = null;
	private static Scanner scan = new Scanner(System.in);
	private static PreparedStatement pstmt = null;
	public static void main(String[] args) {

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			out.println(" 검색성공");
			
			String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
			String user = "root";
			String password = "apmsetup";
			Connection conn = DriverManager.getConnection(url, user, password);
			out.println(" 접속성공");
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
			String sql1 = "SELECT * FROM saram";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql1);
			while(rs.next()){
				String id = rs.getString("id"); //필드 순서 사용가능
				String name = rs.getString("name");
				int age = rs.getInt(3);
				out.println(id+ ", "+name+", "+age);
			}
		} catch (ClassNotFoundException e) {

			out.println(" 검색실패");
			e.printStackTrace();
		} catch (SQLException e) {
			out.print(" 접속실패");
			e.printStackTrace();
		} finally{
			//예외가 있건 없건 무조건 마지막에 처리.
			try{
				if(rs!=null){rs.close();}
				if(stmt!=null){stmt.close();}
				if(conn!=null){conn.close();}
					
				}catch (SQLException e){
					e.printStackTrace();
			}
		}
	}
}
