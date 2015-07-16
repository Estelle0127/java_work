package org.comstudy21.ch07; //public은 하나여야함
//Point 클래스 선언.
class Point{
	int x;
	int y;
}


public class Ch07Ex01PointCls {
	public static void main(String[] args) {
		Point pt01 = new Point();
		//Point 클래스를 이용해서 객체생성
		
		 pt01.x = 30; ///.은 범위 지정 연산자이다.  scope 
		 pt01.y = 40;
		 
		 System.out.println("pt01.x => " + pt01.x);
		 System.out.println("pt01.y => " + pt01.y);
	} //end of main
} // end of class
