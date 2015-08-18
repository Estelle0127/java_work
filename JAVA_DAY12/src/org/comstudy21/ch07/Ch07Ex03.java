package org.comstudy21.ch07;

class People {
	private String name;
	private int age ;
	private String phone;
	//셋터 겟터를 선언하라.
	
	public void name (String _name){
		name = _name;
	}
	public void age(int _age) {
		age = _age;
	}

	public void phone(String _phone) {
		phone = _phone;
	}
	
	public String name () {
		return name;
	}

	public int age() {
		return age;
	}

	public String phone() {
		return phone;
	}
}

class Ch07Ex03 {
	public static void main(String[] args) {
		People p = new People();
		//p가 가르키는 객체에 성명, 나이, 전화번호를 입력후 출력.

		//p.name(DJH);
		p.age(22);
		//p.phone(01041228302);
		
		System.out.println("");
	}

}