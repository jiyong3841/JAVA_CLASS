package day14;

import java.util.Calendar;
import java.util.Scanner;

public class _06_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		// getInstance() : 현재 날짜와 시간을 가져오는 함수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도 입력 : ");
		int year = scan.nextInt();
		
		System.out.print(" 월 입력 : ");
		int month = scan.nextInt();
		
		cal.set(year, month-1, 1); // Calendar 클래스는 월의 시작이 0부터시작
		
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		int lastOfDate = cal.getActualMaximum(Calendar.DATE); // getActualMaximum : 해당 월의 마지막 날짜를 가져오는 함수
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 현재 설저오딘 날짜의 요일을 가져옴(1 : 일요일 ~ 7 : 토요일)
		
		for(int i = 1; i <= week-1; i++ ) { // 달력 시작 날의 주말 처리
			System.out.print("\t");
		}
		for (int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%d\t", i);
			
			if((week-1+i) % 7 == 0) { // 토요일에 날짜 표시후 줄바꿈하는 코드
				System.out.println();
			}
		}
		scan.close();
	}

}
