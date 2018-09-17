/*

	break : 终止当前循环，只能在switch-case和循环结构中使用
			嵌套循环：break终止的是包含它的那层循环

	continue : 终止当次循环，只能在循环结构中使用
			嵌套循环：continue结束当前次循环，结束的是包含它的那层循环

	lable : 标签：用于结束某层循环

*/
public class BreConTest{

	public static void main(String[] args){
	
		
		for(int i = 1; i < 20; i++){
		
			if(i == 10){
				break; //终止当前循环
				//continue; //终止当次循环
				//System.out.println("aaa");  //编译不通过：break,continue后边不能直接再写其它代码
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

		//嵌套continue
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
		//标签 : 想终止哪层循环，就可以在哪层循环加上一个标签
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