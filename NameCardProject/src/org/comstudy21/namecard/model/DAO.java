package org.comstudy21.namecard.model;

import java.util.Vector;

public class DAO {
	//DAO => Data Access Object
	//DABASE �Ǵ� File ������ �������� ��������� Ŭ����
	
	//�ӽ� ������ ���� �÷����� �����.
	private static Vector<DTO> db = new Vector<>();
	//db�� �����͸� ����
	public static void insert(DTO dto) {
		db.add(dto);
	}
	//db�� ������ ����
	public static Vector<DTO> select() {
		return db;
	}
	public static DTO findByName(String name) {
		DTO dto = null;
		//���ڷ� ���� name�� ���� ��Ҹ� ã�Ƽ� dto�� ��´�.
		for(int i=0; i<db.size(); i++) {
			if(name.equals(db.get(i).getName())) {
				dto = db.get(i);
			}
		}
		return dto;
	}
}






