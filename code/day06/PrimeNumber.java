
/*
		������ֻ�ܱ�1�ͱ�������������
		
		100���ڵ���������?

*/

public class PrimeNumber{

	public static void main(String[] args){
	
		/*
		boolean isFlag = true; //��ǩ

		long start = System.currentTimeMillis();

		for(int i = 2; i <= 100000; i++){
			
			//Ŀ�ģ��ж��ǲ�������
			for(int j = 2; j < i; j++){
			
				if(i % j == 0){
				   //��������
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

		System.out.println("���е�ʱ��=" + (end - start));
		*/

		

	
		for(int i = 2; i <= 100; i++){
			
			boolean isFlag = true;

			//Ŀ�ģ��ж��ǲ�������
			for(int j = 2; j < i; j++){
			
				if(i % j == 0){
				   //��������
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