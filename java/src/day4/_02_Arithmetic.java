package day4;

import java.util.Scanner;

public class _02_Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 분을 정수 입력받아 몇시간 몇분으로 환산하는 프로그램 만들기
		 */
		
		int minute;
		System.out.print("정수를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		minute = input.nextInt();
		input.close();
		
		System.out.printf("%d분은 %d시간 %d분입니다.", minute, minute / 60, minute % 60);
		
	}

}
