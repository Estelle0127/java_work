package org.comstudy21.ch06.stringBuffer;

public class StringBufferEx {
	
	//��ǰ����� ����������
	
	/* hello
	 * �ܾ �ϼ��ϼ���
	 * 
	 * -----
	 * 
	 * �Է�: e
	 * 
	 * -e---
	 * 
	 * �Է� : l
	 * 
	 * -ell-
	 * �Է� : k
	 * =>1�� Ʋ�ȴ�.
	 * 
	 * =====
	 * 
	 * 2�ܰ� 
	 * words = {"apple", "computer", "orange", "pencil", "hello"};
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		StringBuffer strBf = new StringBuffer();
		strBf.append("Korea");
		
		System.out.println(strBf.length()) ; //���� �˾ƺ���
		System.out.println(strBf.charAt(3)) ; //4 ��° ���ĺ�
	
		strBf.setCharAt(3,'a'); //�׹�° ���ĺ��� a�� �ٲپ��.
		System.out.println(strBf);
	}
	
	public static void ex01(String[] args){
		
		StringBuffer sb = new StringBuffer("Korea");
		//StringBuffer�� ����ڽ� �ȵȴ�.
		sb.append("Japan");
		
		System.out.println(sb.toString());
		System.out.println(sb);
	}
}
