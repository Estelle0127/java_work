package org.comstudy21.namecard.model;

import java.util.Vector;

public class DAO {
	//DAO => Data Access Object
	//DABASE 또는 File 저장을 목적으로 만들어지는 클래스
	
	//임시 데이터 저장 컬렉션을 만든다.
	private static Vector<DTO> db = new Vector<>();
	//db에 데이터를 저장
	public static void insert(DTO dto) {
		db.add(dto);
	}
	//db에 내용을 전달
	public static Vector<DTO> select() {
		return db;
	}
	public static DTO findByName(String name) {
		DTO dto = null;
		//인자로 들어온 name과 같은 요소를 찾아서 dto에 담는다.
		for(int i=0; i<db.size(); i++) {
			if(name.equals(db.get(i).getName())) {
				dto = db.get(i);
			}
		}
		return dto;
	}
}






