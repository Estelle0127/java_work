package org.comstudy21.ch07;

import java.util.ArrayList;
import java.util.HashMap;

class Point{
	int x,y ;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Ch07Ex04ArrayList {
	public static void main(String[] args) {

		ArrayList<Point> ptList = new ArrayList<>();
		ptList.add(new Point(10, 13));
		ptList.add(new Point(20, 16));
		ptList.add(new Point(30, 18));
		ptList.add(new Point(40, 17));
		ptList.add(new Point(50, 11));
	
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", ptList);
		
		ArrayList<Point> list = (ArrayList<Point>)map.get("list");
		for(Point p : list){
			System.out.println(p.x +", "+p.y);
		}
		
		/*for(Point pt : ptList){
			System.out.println(pt.x+", "+pt.y);
		}*/
	}
}

//List �� ��ü�� ����. �迭 ó�� �̾ƾ��� ��.
//���밴ü�� �� ���� ���� ��, �̰� ���. JSP���� ����.