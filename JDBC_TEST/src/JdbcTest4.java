import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest4 {
	private String id;
	private String name;
	private int age;
	private static Scanner scan = new Scanner(System.in);

	public JdbcTest4() {
		// 입력받기
		input();
		// DB저장
		save();
		// 화면출력
		output();
	}

	public void input() {
		out.print("아이디 입력:");
		id = scan.next();
		out.print("성명 입력:");
		name = scan.next();
		out.print("나이 입력:");
		age = scan.nextInt();
	}
	public Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
			String user = "root";
			String password = "apmsetup";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} catch (SQLException e) {
				e.printStackTrace();
		}
		return conn;
	}
	public void save() {
		
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int res = 0;
		String sql = "insert into saram(id,name,age) values(?,?,?)";
	
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			res = pstmt.executeUpdate();
			if(res>0){
				out.println("성공!");
			}else{
				out.println("입력실패!");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
				try {
					if(pstmt!=null)	{pstmt.close();}
					if(conn!=null) {conn.close();}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	
	}

	public void output() {
		Connection conn = getConnection();
		String sql = "SELECT * FROM saram";
		Statement stmt = null;
		ResultSet rs = null;
		out.println("****사람목록****");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			String id = rs.getString("id");
			String name = rs.getString("name");
			int age= rs.getInt("age");
			out.println(id+" "+name+" "+age);
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null) {rs.close();}
				if(stmt!=null) {rs.close();}
				if(conn!=null) {conn.close();}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		new JdbcTest4();
	}
}
