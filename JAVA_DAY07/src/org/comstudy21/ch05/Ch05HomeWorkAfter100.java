package org.comstudy21.ch05;

import java.util.Scanner;

public class Ch05HomeWorkAfter100 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	int month, day;
	int total = 0;

	System.out.print("�� �Է�: ");
	month = scan.nextInt();
	System.out.print("�� �Է�: ");
	day = scan.nextInt();
	
	System.out.println("�Է��� ��¥ => "+month+"�� "+day+"�� ");
	int nextMonth, nextDay;
	int idx = month;
	total = days[month-1] - day; //���� ��¥

	for(int i=0; i<3; i++){
		idx = idx%12; //12�� ������ ���� 12�� �ȵ�. 12�� �Ǹ� 0�̵ǰ� 13�̵Ǹ� 1�̵� ����
		total = total + days[idx];
		System.out.println("idx =>" + idx );
		idx++;
	}
//total �� 100���� ū�� . 100���� ũ�� �ε������� ��������.
 System.out.println("tota�� = >? "+ total);
 if(total>100){
	 nextMonth = idx;
	 nextDay = days[idx-1] - (total - 100);
 }else{
 
	 nextMonth = idx+1;
	 nextDay = 100 - total;
 }
 	System.out.println("100�� �Ĵ� "+nextMonth+"��"+nextDay+"���Դϴ�."	);
 	
	}
}
