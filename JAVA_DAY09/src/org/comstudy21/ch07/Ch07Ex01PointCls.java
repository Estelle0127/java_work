package org.comstudy21.ch07; //public�� �ϳ�������
//Point Ŭ���� ����.
class Point{
	int x;
	int y;
}


public class Ch07Ex01PointCls {
	public static void main(String[] args) {
		Point pt01 = new Point();
		//Point Ŭ������ �̿��ؼ� ��ü����
		
		 pt01.x = 30; ///.�� ���� ���� �������̴�.  scope 
		 pt01.y = 40;
		 
		 System.out.println("pt01.x => " + pt01.x);
		 System.out.println("pt01.y => " + pt01.y);
	} //end of main
} // end of class
