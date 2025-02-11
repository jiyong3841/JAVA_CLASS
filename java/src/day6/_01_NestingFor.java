package day6;

public class _01_NestingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 ***
		 ***
		 ***
		 ***
		 ***
		 출력
		 */
		
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
		
		for(int i  = 0; i < 5; i++) {//행	
			for(int j = 0; j < 3; j++) {// 행안의 요소 반복
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 0시 0분부터 23시 59분까지 출력해보기
		
		for(int h = 0; h < 24; h++) {
			for(int m = 0; m<60; m++) {
				System.out.println(h + "시" + m + "분");
			}
		}
			
	}

}
