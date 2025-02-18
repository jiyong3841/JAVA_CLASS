package day11;

class book{
	String title;
	int series;
	int page;
	
	book(){
		title = "해리포터";
		series = 7;
		page = 500;
	}
	
	book(String t){
		title = t;
		series = 7;
		page = 500;
	}
	
	book(String t, int s){
		title = t;
		series = s;
		page = 500;
	}
	book(String t, int s, int p){
		title = t;
		series = s;
		page = p;
	}
	
	void bookInfo(){
		System.out.println("제목 : " + title + " \n시리즈 : " + series + "\n페이지 : " + page );
	}
}

public class _02_OverLoading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * book이라는 클래스
		 * 제목, 시리즈, 페이지수
		 * 
		 * 기본생성자 만들고 
		 * 각각의 값을 바꿀 수 있는 오버로딩 생성자들을 만들기 
		 */
		
		book basic = new book();
		basic.bookInfo();
		
		book book1 = new book("반지의 제왕");
		book1.bookInfo();
		
		book book2 = new book("봉제인형 살인사건",1);
		book2.bookInfo();
		
		book book3 = new book("위험한 과학책", 3, 400);
		book3.bookInfo();
		
	}

}
