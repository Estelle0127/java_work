package org.comstudy21.ch05;

public class Ch05Ex01TotAvg {
public static void main(String[] args) {
	int[] arr = new int[]{55, 65, 66, 88, 98, 100, 75};
	int total =0;
	double avg = 0.0;
	
	//arr배열에 있는 값들의 총점과 평균을 구해서 출력하라.
	//반복문은 for문을 사용한다.
	int size = arr.length;
	for (int i=0; i<arr.length;i++){
		total = total + arr[i] ; //arr배열의 모든걸 합한다.
		avg = total / (double)size ;
	}
	System.out.println(total);
	System.out.println((""+avg).substring(0,5)); //문자화 해서 substring 사용.
}
}
