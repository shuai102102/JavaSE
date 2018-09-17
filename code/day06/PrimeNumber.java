
/*
		质数：只能被1和被身所整除的数
		
		100以内的所有质数?

*/

public class PrimeNumber{

	public static void main(String[] args){
	
		/*
		boolean isFlag = true; //标签

		long start = System.currentTimeMillis();

		for(int i = 2; i <= 100000; i++){
			
			//目的：判断是不是质数
			for(int j = 2; j < i; j++){
			
				if(i % j == 0){
				   //不是质数
					isFlag = false;
					break;
				}
			}

			if(isFlag){
				//System.out.println(i);
			}

			isFlag = true;
			
		}

		long end = System.currentTimeMillis();

		System.out.println("运行的时间=" + (end - start));
		*/

		

	
		for(int i = 2; i <= 100; i++){
			
			boolean isFlag = true;

			//目的：判断是不是质数
			for(int j = 2; j < i; j++){
			
				if(i % j == 0){
				   //不是质数
					isFlag = false;
					break;
				}
			}

			if(isFlag){
				System.out.println(i);
			}

			
			
		}
	}
}