package day6;

public class _04_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1;
		do {
			System.out.println(num1);//현재 숫자 출력
			num1++;
		}while (num1 <= 5);
		
		// while과 dowhile의 차이점
		// while은 조건이 false라면 한번도 실행되지 않음
		// dowhile : 조건이 false라도 최소 1번 실행됨
	}

}
