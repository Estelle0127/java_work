package org.comstudy21.ch08;

class Point {
	private int x;
	private int y;

	public void setX(int x){
		//this �� ��ü �ڽ��� ������ �ּ�
		
		this.x = x;
	}
	public void setY(int y){
		//this �� ��ü �ڽ��� ������ �ּ�
		
		this.y = y;
	}
	
	public int getX(){
		//this �� ��ü �ڽ��� ������ �ּ�
		
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	public Point() {
		this(10,10);
		//�����ڿ��� ������ ȣ��
		//������ ȣ�� ���� �ٸ� ������ ���� �� �� ����.
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Ch08Ex01 {
public static void main(String[] args) {
	
}
}
