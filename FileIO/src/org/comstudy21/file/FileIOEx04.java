package org.comstudy21.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileIOEx04 {
	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		System.out.print("input string: ");
		String str = br.readLine();
		
		System.out.println("Str =>" + str);
	
		FileOutputStream out = new FileOutputStream("D:\\data.txt");
		OutputStreamWriter osr = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(osr);
		//bufferedwriter은 파일이 없으면 파일을 생성해서 저장함
		
		osr.write(str); //close는 필수. 안하면 작동안됨. 각각의 스트림 모두 닫아줘야함.
	
		writer.close();
		osr.close();
		out.close();
		br.close();
		in.close();
	}
}
