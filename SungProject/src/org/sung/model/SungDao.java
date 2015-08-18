package org.sung.model;

import java.util.Comparator;
import java.util.Vector;

public class SungDao {
	
	private static Vector<People> list = new Vector<>();
	public static boolean insert(People people) {
		list.add(people);
		
		for(int i = 0; i<list.size(); i++) {
			list.get(i).setRank(1);
			for(int j=0; j<list.size(); j++)
			{
				if(list.get(i).getTotal() < list.get(j).getTotal()){
					list.get(i).setRank(list.get(i).getRank()+1);
				}
			}
		}
		
		
		return true; //boolean 입력이 제대로 안되면 false
	}
	public static Vector<People> select(){
		return list;
	}
	public static Vector<People> findByName(String name){
		Vector<People> findList = null;
		for(int i =0; i<list.size();i++){
			if(name.equals(list.get(i).getName())){
				findList.add(list.get(i));
			}//못찾았다면 null값.
		}
		return findList;
	}
	public static People findByIdx (int idx)	{
		People people = null;
		for(int i =0; i<list.size();i++){
			if(idx == list.get(i).getIdx()){
				people = list.get(i);
			}//못찾았다면 null값.
		}
		return people;
}
	public static boolean modify(People newP){
		People oldP = findByIdx(newP.getIdx());
		if(oldP !=null){
			oldP.setName(newP.getName());
			oldP.setKor(newP.getKor());
			oldP.setEng(newP.getEng());
			oldP.setMat(newP.getMat());
			oldP.setData();
			return true;
		}
		return false;
	}
	public static boolean delete(int idx){
		for(int i = 0; i<list.size();i++){
			if(idx==list.get(i).getIdx()){
				list.remove(i);
				return false;
			}
		}
		return false;
	}
	public static boolean sort(){
		list.sort(new Comparator<People>() {
		
		public int compare(People o1, People o2){
			if(o1.getTotal() < o2.getTotal()){
				return 1;
			}
		 else if(o1.getTotal() < o2.getTotal()){
			return -1;
		}
			return 0;
			}
		});
		return false;
	}
}


