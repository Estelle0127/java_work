package org.comstudy21.ch07;
//���� �����ڸ� �����ϸ� default ����������
//default ���������ڷ� ������ Ŭ������ ���� ��Ű���� �ߺ��ȵ�.
class Point2{
	private int x;
	private int y;
	//�Ϲ������� Ŭ������ �ʵ�� private ����� ����
	//�Ϲ������� Ŭ������ �޼ҵ�� public ����� ����
	public void setX(int value) {
		x = value;
	}
	public void setY(int value){
		y = value;
	}
	public int getX () {
		return x;
	}
	public int getY () {
		return y;
	}
	
}
public class PointCls {
	public static void main(String[] args) {

		Point2 pt01 = new Point2();
		//pt01.x = 100;
		//pt01.y = 200;
		
//		System.out.println("pt01.x=>" + pt01.x);
	//	System.out.println("pt01.y=>" + pt01.y);
	
		pt01.setX(150);
		pt01.setY(250);
		System.out.println("pt01.getX() => " + pt01.getX());
		System.out.println("pt01.getY() =>" + pt01.getY());
	
	
	}
}//�� ��Ű�� �ȿ� ���� �̸��� Ŭ������ 1���� ����.
