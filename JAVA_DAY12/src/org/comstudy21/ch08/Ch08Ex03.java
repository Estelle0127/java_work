package org.comstudy21.ch08;

class Circle {
	private double r; //����ʵ�

	public Circle(double r) { //������
		this.r = r;
 
	}

	public double getArea() { //��� �޼ҵ�
		return Math.PI * r * r;
	}
}

public class Ch08Ex03 {
	public static void main(String[] args) {
		Circle[] cArr; //�迭�� ���(�����ϴ�) ��������.
		cArr = new Circle[5];
		for(int i =0; i<cArr.length;i++){
			cArr[i] = new Circle(i);
			
		} for(int i =0; i<cArr.length;i++){
			System.out.println((cArr[i].getArea()+"").substring(0,5));
		}
	}
}
