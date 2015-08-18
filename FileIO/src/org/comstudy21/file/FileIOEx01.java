package org.comstudy21.file;

import java.io.IOException;

public class FileIOEx01 {
	public static void main(String[] args) throws IOException {

		int data = 0; 
		
		System.out.print("Inout: ");
		while((data=System.in.read())!= -1){
			System.out.print((char)data);
		}
		//한글처리 불가능, 영어랑 숫자만 가능
	}	//한줄씩 입력받는 형태. 
}
