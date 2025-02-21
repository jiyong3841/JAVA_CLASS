package day14;

import java.util.Calendar;

public class _05_JavaUtilCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance(); // 추상클래스, 다른 객체처럼 new 키워드를 사용해 선언하면 오류남
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 : " + year + "년 " + month + "월 " + day + "일 입니다.");
	}

}
