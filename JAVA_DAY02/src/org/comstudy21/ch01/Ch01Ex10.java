package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex10 {
	private static Scanner scan = new Scanner(System.in);//�ۺ��� �ܺο��� ���ٰ��������� �����̺��� �Ұ�
	public static void main(String[] args ){
		double area = 0.0; //����
		double line = 0.0; //�ѷ��� ����
		double r = 0.0;	//������
		double PI = Math.PI; //3.141592
		//final�� ���� ����� ����ϸ� ����� �ȴ�. final double PI�� PI�� ��
		
		line = PI * 2 * r ;
		
		//�������� �Է� �޾Ƽ� ���� ������ �ѷ��� ���̸� ����ϴ� ���α׷�
		//���� ������ �ѷ��� ���̸� ����ϴ� ���α׷�
	
		System.out.print("������ :");//1 ""����
		r = scan.nextDouble();//2�Է� �޾ƿ���
		System.out.print("���� :");
		area = PI * r * r ;//3 area����
		System.out.println(area);
		
		System.out.print("�ѷ� :");
		line = PI * 2 * r ;
		System.out.println(line);
	}
	
	
}
/*�ĺ��� ����Ģ(�۸��Ģ)
 * 1. ���� ��/�ҹ���, ���� Ư������(_,$)�� �������� ����Ѵ�.
 * 2. �ѱ��� ����� �� �ִ�.(������ �����ʴ� ���� ����)
 * 3. ��/�ҹ��� ������ �Ѵ�. int�� INT�� �ٸ���.
 * 4. ù ���ڷ� ���ڰ� �� ������.
 * 5. ����� ������
 * 7. �ߺ��� �̸� ��� ����
 * 8. Ư�����ڳ� �������� ���� &name, @age,
 * 9. int 30age;
 * 10. 
 *
 */
