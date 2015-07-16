package org.comstudy21.ch01;
import java.io.IOException;
public class Ch01Ex04 {
	public static void main(String[ ] args) throws IOException{
		
		byte[] by = new byte[20];
		
		System.out.println("성명 :");
		System.in.read(by); //byte 배열에 입력

//입력받을 때는 어떤 것이 입력될지 모르기에, 예외상황이 일어날 수 있다.
//그렇기에, 그 상황을 시스템에 넘기겠다 - add throws declaration		
				
		System.out.print("입력한 이름: ");
		System.out.write(by); //byte[] 배열에 있는 것을 출력한다
	}	
}