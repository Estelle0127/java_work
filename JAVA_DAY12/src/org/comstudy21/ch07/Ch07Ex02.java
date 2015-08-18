package org.comstudy21.ch07;

class Point02 {
	private int x;
	private int y;

	public void setX(int _x) {
		x = _x;
	}

	public void setY(int _y) {
		y = _y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

public static class Ch07Ex02 {
	public static void main(String[] args) {
		Point02 pt = new Point02();
		//pt.x = 10;
	//	pt.y = 20; //private를 붙여서, 외부에서 접근이 불가능.
		
		
		pt.setX(10);
		pt.setY(20);
		
		System.out.println("pt.x=>" + pt.getX() );
		
		
		
		
	}
}

}