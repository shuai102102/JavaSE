package com.atguigu.exer;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = {23,56, 4, 89,102,12,59};
		  new argsTest().a(num); 
		 
		 
		for(int i=1;i<=num.length;i++){
			for(int j=1;j<=num.length-1;j++){
				if(num[j-1]>num[j]){
					int temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
}

class argsTest{
	
	public  argsTest(){
		
	}
	 argsTest(argsTest argstest){
		
	}
	void a(int...num){
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
}