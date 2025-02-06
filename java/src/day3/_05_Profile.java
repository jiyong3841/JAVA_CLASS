package day3;

import java.util.Scanner;

public class _05_Profile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 이름
		 * 2. 주소
		 * 3. 나이
		 * 4. 키
		 * 당신의 **은 ***입니다.
		 * */
		String name, address;
		int age;
		double height;
		Scanner Profile = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = Profile.next();
		System.out.print("주소를 입력하세요 : ");
		address = Profile.next();
		System.out.print("나이를 입력하세요 : ");
		age = Profile.nextInt();
		System.out.print("키를 입력하세요 : ");
		height = Profile.nextDouble();
		Profile.close();
		
		System.out.printf("당신의 이름은 %s입니다.", name);
		System.out.printf("당신의 주소는 %s입니다.",address);
		System.out.printf("당신의 나이는 %d살입니다.",age);
		System.out.printf("당신의 키는 %.1fcm입니다.",height);
	}

}
