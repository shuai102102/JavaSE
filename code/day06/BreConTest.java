/*

	break : ��ֹ��ǰѭ����ֻ����switch-case��ѭ���ṹ��ʹ��
			Ƕ��ѭ����break��ֹ���ǰ��������ǲ�ѭ��

	continue : ��ֹ����ѭ����ֻ����ѭ���ṹ��ʹ��
			Ƕ��ѭ����continue������ǰ��ѭ�����������ǰ��������ǲ�ѭ��

	lable : ��ǩ�����ڽ���ĳ��ѭ��

*/
public class BreConTest{

	public static void main(String[] args){
	
		
		for(int i = 1; i < 20; i++){
		
			if(i == 10){
				break; //��ֹ��ǰѭ��
				//continue; //��ֹ����ѭ��
				//System.out.println("aaa");  //���벻ͨ����break,continue��߲���ֱ����д��������
			}

			System.out.println(i);
		}
		

		/*
		break;

		for(int i = 1; i < 6; i++){
		
			for(int j = 1; j < 6; j++){
			
				if(j == 2){
					break;
				}

				System.out.println("j=" + j);
			}

			System.out.println("i=" + i);
		}
		*/

		//Ƕ��continue
		/*
		for(int i = 1; i <= 3; i++){
		
			for(int j = 1; j <= 3; j++){
			
				if(j == 2){
					continue;
				}

				System.out.println("j=" + j);
			}

			System.out.println("i=" + i);
		}
		*/


		/*
		//��ǩ : ����ֹ�Ĳ�ѭ�����Ϳ������Ĳ�ѭ������һ����ǩ
		lable : for(int i = 1; i < 6; i++){
		
			for(int j = 1; j < 6; j++){
			
				if(j == 2){
					break lable;
				}

				System.out.println("j=" + j);
			}

			System.out.println("i=" + i);
		}
		*/


	}
}