package org.comstudy21.ch04;

public class Ch04Homework4 {
	//cur :        1	1
	//sum (����) : 0   	1
	//flag : 	 true  false
	//
	
	public static void main(String[] args){
			boolean flag = true;
			
				int sum = 0;//sum�� �ٱ������� ������ �ϱ� ������ for�ȿ� ������ �ȵȴ� : ������ ������.
				
				for (int pre = 0,cur=1,next=0;cur<= 21;next = pre + cur,pre = cur,cur = next ) {
					if(flag==true){
							System.out.print(cur + (cur==21?"=":"+"));
						if(cur==1){
							
							sum = sum + cur ;
						}else{ sum=sum-cur;
							
							}
						
						flag=false;		
					}else{
						System.out.print(cur + (cur==21?"=":"-"));

						}
						sum = sum - cur;
						
						flag=true;
					}
					
				}
				//System.out.println(sum); �̿ϼ�!
		 }
		
	