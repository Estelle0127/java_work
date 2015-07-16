package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex05 {
	public static void main(String[]args) throws IOException{

		
		
		System.out.print("입력 : "); //2. 입력
		int ch = System.in.read();//1. 정수형을 사용할 것이다.
		System.in.read();// 버퍼의 '\n' 제거
		System.in.read();// 버퍼의 '\r' 제거
		System.out.print("입력2: ");
		int ch2 = System.in.read();
		//안되는 원인 잘 이해못했음.
		
		System.out.println("ch => " + (char)ch); //3. 입력한걸 내보내기
		System.out.println("ch2 => " + (char)ch2);
	//입출력 스트리밍에 다시 할 거임	
	//(char) 은, 숫자를 문자로 바꿔버리는 명령. 너는 이제 숫자가 아니라 문자야!(강제)
	//이것을 아스키코드라고 한다. 바이너리 코드. : 키보드에 있는 자판들에는 고유의 번호가 다 있다. 
	// 컴퓨터는 우리가 a를 입력하면 97번 코드를 쳤다고 인식한다. 
	}
}
