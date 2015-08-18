package org.comstudy21.ch05;

class Person {
	String name;
}

class Student extends Person {
	char grade;
}

public class DowncastingEx {
	public static void main(String[] args) {
		//Student s = new Person(); 하위에서 상위. 불가능.
	
		
		Person p = new Student();
		Student s = new Student();
		s.grade = 'A';
		
		p= s; //업캐스팅
		//p.grade = 'D';
		//부모 타입으로 업캐스팅 된 후에는 자손의 고유 멤버는 접근 불가.
		
		s = (Student)p;
		s.grade = 'D';
	
	}
}
