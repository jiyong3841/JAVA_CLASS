package day7;

import java.util.Scanner;

public class _01_UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~50 의 난수를 생성할 것 
		 * 숫자를 입력하세요 (잔여 횟수 : 5) : 
		 * 정답을 맞췄다면 종료됨
		 * 업 / 다운
		 * 5번의 기회를 모두 소진하면 실패
		 */
		
		int randomNum = (int)(Math.random()*50)+1;
		
		Scanner numInput = new Scanner(System.in);
		
		boolean match = false;
		
		for(int i = 5; i >=1; i--) {
			System.out.println("숫자를 입력하세요 (잔여횟수 : "+i+") : ");
			int userNumInput = numInput.nextInt();
			
			if(userNumInput  == randomNum) {
				match = true;
				System.out.println("정답입니다.");
				break;
			}else if(userNumInput > randomNum) {
				System.out.println("다운");
			}else if(userNumInput < randomNum) {
				System.out.println("업");
			}
		}
		
		if(!match) {
			System.out.println("기회를 전부 소진하였습니다.");
		}
		numInput.close();
		
	}
	
}
