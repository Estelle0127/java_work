package org.comstudy21.ch04;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class CircleManager {
	static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}

	static boolean equals(Circle a, Circle b) {
		if(a.getRadius() == b.getRadius())
			return true;
		else
			return false;
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizza, waffle);
		if(res == true)
			System.out.println("같다");
		else 
			System.out.println("같지않다");
	
		
	CircleManager.copy(pizza, waffle);
	res = CircleManager.equals(pizza, waffle);
	if(res == true)
		System.out.println("같다");
	else 
		System.out.println("같지않다");

		
		
	}
}



/*	6번 정답
 *	this(10,1);
 *		
 *	this.width = width;
 *	this.height = height;
 *	
 *	for(int j=0; j<width; j++) {
 *	System.out.print(filChar);
 *
 *	}
 *
 *for(int j=0; j<width; j++)
 * System.out.print(filChar);
 *	System.out.println();
 *
 *
 *	this.fillChar = c;
 *
 *
 * 
 */

/* 7번
 * 
 * private String name;
 * public player(String name){this.name = name}
 * 
 * new Player[2];
 * 
 * int i =0; i<p.length; i++
 * 
 *  if(val[0] == val[1] == val[2]){
 * 
 * 	System.out.println(p[n].getName + "이 승리하였다.");
 * 	break;
 * }
 */
 
