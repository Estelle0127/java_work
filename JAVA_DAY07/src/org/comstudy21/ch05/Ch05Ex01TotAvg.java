package org.comstudy21.ch05;

public class Ch05Ex01TotAvg {
public static void main(String[] args) {
	int[] arr = new int[]{55, 65, 66, 88, 98, 100, 75};
	int total =0;
	double avg = 0.0;
	
	//arr�迭�� �ִ� ������ ������ ����� ���ؼ� ����϶�.
	//�ݺ����� for���� ����Ѵ�.
	int size = arr.length;
	for (int i=0; i<arr.length;i++){
		total = total + arr[i] ; //arr�迭�� ���� ���Ѵ�.
		avg = total / (double)size ;
	}
	System.out.println(total);
	System.out.println((""+avg).substring(0,5)); //����ȭ �ؼ� substring ���.
}
}
