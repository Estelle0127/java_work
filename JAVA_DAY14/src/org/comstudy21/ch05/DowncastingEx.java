package org.comstudy21.ch05;

class Person {
	String name;
}

class Student extends Person {
	char grade;
}

public class DowncastingEx {
	public static void main(String[] args) {
		//Student s = new Person(); �������� ����. �Ұ���.
	
		
		Person p = new Student();
		Student s = new Student();
		s.grade = 'A';
		
		p= s; //��ĳ����
		//p.grade = 'D';
		//�θ� Ÿ������ ��ĳ���� �� �Ŀ��� �ڼ��� ���� ����� ���� �Ұ�.
		
		s = (Student)p;
		s.grade = 'D';
	
	}
}
