package org.comstudy21.ch06;

class Point3 {
	int x, y;

	public Point3() {
	}

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return x + ", " + y;
	}
	public boolean equals(Point3 p)	{
	
		if(this.x==p.x && this.y == p.y){ //����  ��
			return true ;
		}
			return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point3 p1 = new Point3 (10, 10);
		Point3 p2 = new Point3 (10, 10);
	
System.out.println(p1.equals(p2)); //equals�� �Ҷ��� p1�� p2�� �ּҷθ� ��.
	}
}
