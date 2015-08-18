package org.comstudy21.ch05;

//Ŭ���� �ȿ� �ִ� class�鸸 static ������ ��.


public class IstanceOfEx {
	static class Person{}
	static class Student extends Person{}
	static class Researcher extends Person{}
	static class Professor extends Researcher{}
	
	static void printObj(Person p){
		if (p instanceof Person){
			System.out.print("Person ");
		} if(p instanceof Student){
			System.out.print("Student ");
		} if(p instanceof Researcher){
			System.out.print("Researcher ");
		} if(p instanceof Professor){
			System.out.print("Professor ");
		}
	}
	
	public static void main(String[] args) {
	printObj(new Person());
	printObj(new Student());
	printObj(new Researcher());
	printObj(new Professor());
}
}
