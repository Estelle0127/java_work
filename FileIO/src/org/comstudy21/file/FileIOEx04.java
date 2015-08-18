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
		//bufferedwriter�� ������ ������ ������ �����ؼ� ������
		
		osr.write(str); //close�� �ʼ�. ���ϸ� �۵��ȵ�. ������ ��Ʈ�� ��� �ݾ������.
	
		writer.close();
		osr.close();
		out.close();
		br.close();
		in.close();
	}
}
