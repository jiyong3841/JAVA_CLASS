package day11;

class Phone{
	String color;
	int storage;
	int price;

	Phone(){
		color = "스페이스그레이";
		storage = 64;
		price = 1290000;
	}
	// 색상만 설정하는 생성자
	Phone(String c){
		color = c; // 객체 생성할 때 매개변수로 입력받을 것
		storage = 64;
		price = 1290000;
	}
	// 색상과 저장공간을 설정하는 생성자
	Phone(String c, int s){
		color = c; 
		storage = s;
		price = 1290000;
	}
	// 색상과 저장공간, 가격을 설정하는 생성자
	Phone(String c, int s, int p){
			color = c; 
			storage = s;
			price = p;
	}
	
	//출력메서드
	void phoneInfo() {
		System.out.println("색상 : " + color + " / 저장공간 : " + storage + "GB / 가격 : " + price);
	}
	
}


public class _01_OverLoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기본모델
		Phone basic = new Phone();
		basic.phoneInfo();
		
		// 색상만 변경 원하는 고객
		Phone colorChangePhone = new Phone("핑크색");
		colorChangePhone.phoneInfo();
		
		// 색상과 저장공간 변경
		Phone colorStoragePhone = new Phone("화이트", 128);
		colorStoragePhone.phoneInfo();
		
		// 상위버전 구매하고 싶은 고객
		Phone premiumPhone = new Phone("골드", 512, 2560000);
		premiumPhone.phoneInfo();
	}

}
