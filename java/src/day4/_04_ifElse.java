package day4;

import java.util.Scanner;

public class _04_ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		if(a>15) {
			System.out.println("조건을 충족합니다.");
		}else {
			System.out.println("조건을 충족하지 않습니다.");
		}
		
		/*
		 * 국영수 점수를 입력받아 각 과목이 60점 이상이면 합격 한과목이라도 60점 미만이면 불합격
		 */
		
		int kor,en,math;
		
		Scanner input = new Scanner(System.in);
		System.out.print("국어, 영어, 수학점수를 입력하세요 : ");
		kor = input.nextInt();
		en = input.nextInt();
		math = input.nextInt();
		input.close();
		
		if(kor >= 60 && en>=60 && math>=60) {
			System.out.println("모든 점수가 60점 이상으로 합격입니다.");
		}else {
			System.out.println("한 과목 이상이 60점 미만이라 불합격입니다.");
		}
		////////////////////////////////////////////
		
		if(kor < 60 || en<60 || math<60) {
			System.out.println("한 과목 이상이 60점 미만이라 불합격입니다.");
		}else {
			System.out.println("모든 점수가 60점 이상으로 합격입니다.");
		}
		
		
	}

}
