package day4;

public class _05_Multifulif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(조건1){
		 * 		조건1이 참일 때 실행
		 * }else if(조건2){
		 * 		조건2가 참일 때 실행
		 * }else if(조건3){
		 * 		조건3가 참일 때 실행
		 * }else{
		 * 		모든 조건에 부합하지 않을 경우 실행
		 * }
		 */
		
		int age = 12;
		int fee;
		if(age <= 5) {
			fee = 0;
		}else if(age <=12) {
			fee = 5000;
		}else if(age <= 18) {
			fee = 8000;
		}else {
			fee = 10000;
		}
		System.out.println("입장료는 "+ fee + "원 입니다.");
		
	}

}
