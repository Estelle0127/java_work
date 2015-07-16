package org.comstudy21.ch04;

public class Ch04Homework5 {

	public static void main(String[] args){
		
		boolean flag = true;
		for(int i =0; i<10; i++){
			
			if(flag == true) {
				System.out.println("위~");
				flag = false;//안바꿔주면 계속 위만 뜸.
			}else{
				System.out.println("아래~");
				flag = true;//안바꿔주면 위-아래아래아래아래
			}
		}
	}
	
}
