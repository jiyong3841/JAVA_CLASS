package day6;

import java.util.Scanner;

public class _05_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String password;
		String correctPassword = "1234";
		int attempts = 0;
		int max_attempts = 3;
		do {
			System.out.println("비밀번호를 입력하세요 : ");
			password = in.nextLine();
			attempts++;
			if (password.equals(correctPassword)) {
				System.out.println("암호 해제 완료");
				return;
			}
			if(attempts == max_attempts) {
				System.out.println("비밂번호 3회 오류! 강제잠금 실행!");
				return;
			}
		}while(true);
		//무한루프이지만, 종료 조건이 있기 때문에 자연스럽게 프로그램이 종료됨
	}

}
