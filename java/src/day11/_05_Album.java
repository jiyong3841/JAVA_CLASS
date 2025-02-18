package day11;

class album{
	String title;
	String singer;
	int trackCount;
	boolean member;
	
	album(){
		this("제목", "가수", 0, false);
	}
	
	album(String title, String singer, int trackCount, boolean member){
		this.title = title;
		this.singer = singer;
		this.trackCount = trackCount;
		this.member = member;
		
	}
	void albumInfo() {
		System.out.println("앨범 제목 : " + this.title);
		System.out.println("가수 : " + this.singer);
		System.out.println("수록곡 개수 : " + this.trackCount);
		System.out.println("지니뮤직 회원인가요? : " + this.member);
		System.out.println("----------------");
	}
}


public class _05_Album {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 앨범의 제목, 가수 수록곡 개수를 필드로 만들고
		 * this를 사용한 생성자를 활용하여 객체를 생성한 뒤 정보 출력하기
		 * 앨범 제목 : 
		 * 가수 : 
		 * 수록곡 개수 : **곡
		 */
		album a1 = new album("블루밍", "아이유", 3, true);
		a1.albumInfo();
		
		album a2 = new album();
		a2.albumInfo();
		
	}

}
