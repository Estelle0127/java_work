package org.comstudy21.file;

import java.io.File;
import java.io.IOException;

public class FileIOEx05 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\data2.txt");
		//��ü�� �����Ǿ ������ ��������� �ʴ´�.
		
		if(file.exists())	{
			System.out.println("������ �����Ѵ�.");
		}else{
			System.out.println("������ �������� �ʴ´�.");
			if(file.createNewFile()){
				System.out.println("������ �����Ǿ���.");
			}
		}
		
		
	}
}
