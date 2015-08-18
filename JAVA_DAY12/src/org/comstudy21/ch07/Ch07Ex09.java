package org.comstudy21.ch07;
class People{
	String name;
	int age;

	public People(){
		
	}
	//생성자 오버로딩을 하면 반드시 디폴트 생성자도 만들어줘야 한다.
	
	
	//생성자 오버로딩만 있고 디폴트 생성자가 없다.
	People(String _name, int _age) {
		name = _name;
		age = _age;
	}
}
public class Ch07Ex09 {
	public static void main(String[] args) {
		People p = new People();
		//생성자 오버로딩 해서 디폴트 생성자가 없다.
	}	
}
