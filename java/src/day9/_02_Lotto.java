package day9;

import java.util.Scanner;

public class _02_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2차원 배열을 선언과 동시에  채워줌
		 * 5행 6열에 원하는 숫자 조합을 1~45까지 넣기
		 */
		
		int[][] lotto = {
				{1,6, 1,11,33,42,44},
				{1,6,17,22,24,33},
				{7,16,24,33,42,44},
				{11,27,32,34,43,46},
				{6,17,22,24,33,41}
				
		};
		
		Scanner scan = new Scanner(System.in);
		String myNum ="";
		System.out.println("숫자 6개를 연속으로 입력");
		myNum = scan.nextLine();
		
		String[] inputNumbers = myNum.split(" ");
		// split : 특정 문자를 기준으로 잘라서 문자열 배열로 만들어줌
		// 2 6 11 13 33, 24, 42	->{"2","6","11","13","33","24","42"}
		
		myNum = String.join("", inputNumbers);
		// join : 배열에 저장된 문자열을 배열로 만들어줌
		// "" : 문자열을 합칠때 사이에 넣을 구분자를 넣는 공간인데 현재 그냥 연결한것
		// inputNumbers : 합칠 문자열이 들어 있는 배열 
		
		boolean isWin = false;
		for(int i =0; i< lotto.length;i++) {
			String lottoNumber = "";
			for(int j =0; j < lotto[i].length; j++) {
				lottoNumber += lotto[i][j];
				//{2,6,11,33,42,44} ->{2611334244}
			}
			if (myNum.equals(lottoNumber)){
				//myNum : 사용자가 입력한 값
				//equals : 두 문자열을 비교하는 메서드(같으면 True / 다르면 false 도출)
				isWin = true;
				break;
			}
		}
		if(isWin) {
			System.out.println(myNum + "번호 당첨!");
		}else {
			System.err.println(myNum + "번호는 당첨되지 않았습니다");
		}
		scan.close();
	}

}
