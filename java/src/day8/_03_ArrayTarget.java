package day8;

import java.util.Scanner;

public class _03_ArrayTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자 5개가 들어간 배열 
		 * 입력받은 숫자(target)가 배열에 들어있는지 확인
		 * 들어있다면 target(숫자)은 배열에 있습니다 없으면 없습니다.
		 */
		
		int[] arr = {2,4,6,8,10};
		System.out.println("정수 하나를 입력해주세요 : ");
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		boolean match = false;
		input.close();
		
		
		for(int i:arr) {
			if(target == i) {
				match = true;
//				System.out.printf("%d는 배열에 들어있습니다.", target);
			}//else {
//				System.out.printf("%d는 배열에 없습니다.", target);
//			}
		}
		if (match == true) {
			System.out.printf("%d는 배열에 들어있습니다.", target);
		}else {
			System.out.printf("%d는 배열에 없습니다.", target);
		}
	}
}
