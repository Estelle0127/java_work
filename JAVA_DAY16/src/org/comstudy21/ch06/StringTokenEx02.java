package org.comstudy21.ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx02 {
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(scan.nextLine(), "/");

		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
			//�Է��� ���� �����ؼ� ���.
			String[] strArr = new String [st.countTokens()];
			int cnt = 0;
			while(st.hasMoreTokens()) {
				String str = st.nextToken();
				strArr[cnt++] = str;
			} //�迭�� ����ֱ�
			
			for(int i=0; i<strArr.length;i++){
				System.out.println(strArr[i]);
			}
		}
	}
}
