package org.comstudy21.namecard.view;

import static org.comstudy21.namecard.Util.*;

import org.comstudy21.namecard.model.DTO;

import static org.comstudy21.namecard.R.*;

public class Input extends View {

	@Override
	public void show() {
		String name="";
		String phone="";
		DTO dto = null;
		
		println("*** Input Menu ***");
		print("�����Է�: ");
		name = scan.next();
		print("��ȭ��ȣ: ");
		phone = scan.next();
		//�Է� ���� �����͸� dto ��ü�� ��´�.
		dto = new DTO(name, phone);
		//dto�� session�� ��´�.
		session.put("DTO", dto);
		
		//������ �Է��� ������ Controller�� �ڵ� ����.
	}
}
