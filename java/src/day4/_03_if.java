package day4;

import java.util.Scanner;

public class _03_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(조건식){
		 * 		조건식이 참이라면 실행할 코드
		 * }
		 * 
		 * */
		
		int a = 5;
		if(a > 1) {
			System.out.println("조건이 참입니다.");
		}
		/*
		 * 정수를 입력받아 음의 정수라면 양의 정수로 바꿔 출력하는 프로그램
		 */
		int num;
		System.out.print("정수를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		input.close();
		
		if(num < 0){
			num *= -1;
			System.out.println("음의 정수를 양의 정수로 변환");
			System.out.println(num);
		}
		
	}

}
