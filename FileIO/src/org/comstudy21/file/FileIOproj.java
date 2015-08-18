package org.comstudy21.file;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class FileIOproj {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		int data = 0;
		
		OutputStream myOut = System.out;
		FileInputStream fis = new FileInputStream("D:\\saram.txt");
		while((data=fis.read())!=-1){
		System.out.print((char)data);}
		String data = 0;
		StringTokenizer st = new StringTokenizer(data,"|");
	
	
	
		Class.forName("org.gjt.mm.mysql.Driver");
		out.println(" 八祸己傍");
		
		String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "apmsetup";
		Connection conn = DriverManager.getConnection(url, user, password);
		out.println(" 立加己傍");
		String sql = "insert into saram(id, name, age) values(?,?,?)";
		
	
	
	
	}
}
