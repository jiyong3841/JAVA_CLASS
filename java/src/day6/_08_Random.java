package day6;

import java.util.Scanner;

public class _08_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomInt =(int)(Math.random()*10) +1;
		System.out.println("랜덤 정수 : "+ randomInt);
		//Math.random(): 0.0이상 1.0 미만의 실수를 변환
		//(int) : 소수점을 버림
		
	}

}
