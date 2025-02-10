package day5;

import java.util.Scanner;

public class _01_Nestingif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중첩 if : if문 안에 if문이 들어가는 구조
		 * 
		 * if(조건1){
		 * 		조건 1을 만족하면 실행할 코드
		 * 		if(조건2){
		 * 			조건 1,2를 만족하면 실행할 코드
		 * 		}else {
		 * 			조건 1을 만족하지만 조건 2는 만족하지 않음
		 * 		}
		 * }
		 */
		if(10 < 20) {
			System.out.println("20이 10보다 크다");
			if(50<30) {
				System.out.println("50이 30보다 크다");
			}else {
				System.out.println("30은 가장 크지 않다");
			}
		}else {
			System.out.println("뭔가 잘못됨!!");
		}
		// 1번째 if문의 조건이 만족해야만 안쪽 if문을 검사할 수 있는 기회가 주어짐
		
		/*
		 * 1. 놀이기구를 타려면 키가 120이 넘어야 하고 120이 넘더라도 나이가 10살 미만이라면 보호자가 필수
		 */
		
//		Scanner input1 = new Scanner(System.in);
//		System.out.print("키를 입력하세요 : ");
//		double height = input1.nextDouble();
//		
//		
//		if(height >= 120) {
//			Scanner input2 = new Scanner(System.in);
//			System.out.print("나이를 입력하세요 : ");
//			int age = input.nextInt();
//			input1.close();
//			input2.close();
//			
//			if(age >= 10) {
//				System.out.println("놀이기구 탑승 가능");
//			}else {
//				System.out.println("보호자 동반시 놀이기구 탑승 가능");
//			}
//
//		}else {
//			System.out.println("놀이기구 탑승 불가능");
//		}
		
		/*
		 * 학생 출석 및 과제 제출 여부 
		 * 1. 학생 출석 확인 (yes, no)
		 * 2. 과제 제출했는지 확인 (yes, no)
		 * 3. 제출했다면 - 수업 참여 인정
		 * 4. 과제 제출 x 50 %출석 인정
		 * 출석평가에서 -3점 감점됨
		 * 
		 * String 변수명.next();
		 * 변수명.equalsIgnoreCase('yes')
		 */
		String attendence;
		Scanner in = new Scanner(System.in);
		System.out.println("학생의 출석 여부를 입력하세요 (yes or no) : ");
		attendence = in.next();
		
		if(attendence.equalsIgnoreCase("yes")) {
			//equalsIgnoreCase 문자열 비교할때 사용하는 메서드
			// equals()
			String summit;
			
			System.out.println("과제 제출 여부를 입력하세요 (yes or no) : ");
			summit= in.next();
			in.close();
			
			if(summit.equalsIgnoreCase("yes")) {
				System.out.println("수업 참여 인정");
			}else {
				System.out.println("과제를 제출하지 않아 50% 출석 인정");
			}
		}else {
			System.out.println("출석평가에서 -3점 감점");
		}
		
	}

}
