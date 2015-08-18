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

//List 에 객체를 넣음. 배열 처럼 뽑아쓰면 됨.
//공통객체를 쓸 일이 생길 때, 이걸 사용. JSP에서 쓰임.