package day3;

import java.util.Scanner;

public class _04_trapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 윗변, 밑변, 높이를 입력받아서 윗, 밑, 높이를 가지고 너비를 구하는 코드를 작성
		// 실수형
		
		double top, base, height;
		Scanner in = new Scanner(System.in);
		System.out.println("윗변, 밑변 ,높이를 연속으로 입력하세요 (공백으로 구분)");
		top = in.nextDouble();
		base = in.nextDouble();
		height = in.nextDouble();
		in.close();
//		System.out.print("윗면의 길이를 입력하세요 : ");
//		top = in.nextDouble();
//		
//		System.out.print("밑면의 길이를 입력하세요 : ");
//		base = in.nextDouble();
//		
//		System.out.print("높이를 입력하세요 : ");
//		height = in.nextDouble();
//		in.close();
		
		System.out.println("사다리 꼴의 넓이 = (" + top +"+" + base + ") *" + height + " / 2" + " = " + (top+base)*height/2 );
		
	}

}
