package day5;

import java.util.Scanner;

public class _03_MenuCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * f,F를 입력했다면 File Menu 출력
		 * h,H를 입력했다면 Help Menu 출력
		 * e,E를 입력했다면 Edit Menu 출력
		 * 
		 * 변수.next().charAt(0);
		 */
		
		Scanner input = new Scanner(System.in);
		char menu;
		System.out.println("F(f) / H(h) / E(e) 중 하나를 입력하세요 : ");
		menu = input.next().charAt(0);
		input.close();
		
//		if(menu == 'f' || menu == 'F'){
//			System.out.println("File Menu");
//		}else if(menu == 'H' || menu == 'h'){
//			System.out.println("Help Menu");
//		}else if(menu == 'E' || menu == 'e'){
//			System.out.println("Edit Menu");
//		}else {
//			System.out.println("Error");
//		}
		
		switch(menu) {
		case 'f':
		case 'F':
			System.out.println("File Menu");
			break;
		case 'h':
		case 'H':
			System.out.println("Help Menu");
			break;
		case 'e':
		case 'E':
			System.out.println("Edit Menu");
			break;
		default:
			System.out.println("Error");
		
		
		}
		
			
		
	}

}
