package org.comstudy21.ch05;


class A{
	public A(){
		System.out.println("A税 持失切");
	}
}
class B{
	public B(){
		System.out.println("B税 持失切");
	}
}
class C extends B{
	public C(){
		System.out.println("C税 持失切");
	}
}

public class ConstructorEx {
	public static void main(String[] args) {
		C c;
		c=new C();
	}
}
