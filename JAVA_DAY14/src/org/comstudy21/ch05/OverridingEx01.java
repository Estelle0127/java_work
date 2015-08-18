package org.comstudy21.ch05;

class 할베 {
	void 나팔 (){
		System.out.println("할베의 나팔 뽕~");
	}
}
class 아베 extends 할베{
	void 나팔 (){
	System.out.println("아베의 나팔 뿡~");
}//나팔이 오버라이딩 됨.
	
}

class 삼촌 extends 할베 {
	void 나팔(){
		
			System.out.println("삼촌의 나팔 삐리리~");
		
	}
}

public class OverridingEx01 {
	public static void main (String[] args){
		할베 h = new 아베();
		h.나팔(); //동적 바인딩 된다. 참조값과는 상관 없이, 실제 오브젝트가 가지고 있는 게 출력된다.
	
		h = new 삼촌();
		h.나팔();
	}
}
