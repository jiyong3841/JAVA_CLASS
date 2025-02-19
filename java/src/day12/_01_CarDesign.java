package day12;

class CarDesign{
	String brand;
	int speed;
	
	CarDesign(){
		this("현대",100);
	}
	
	CarDesign(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}
	
	void run() {
		System.out.println("brand : " + brand + " / speed" + speed);
	}
}

class SportsCar extends CarDesign{
	SportsCar(String brand, int speed){
		super(brand,speed);	//super() : 부모클래스의 생성자 호출 
	}
	
	@Override
	/*
	 * 오버라이딩이 중요한 이유!
	 * 1. 부모클래스의 기능을 유지하면서, 자식클래스만의 동작을 추가할 수 있음
	 * 2. 부모클래스로 여러 자식 클래스를 다룰 때 각각의 run() 이 다르게 실행됨
	 * 3. 객체지향프로그래밍의 핵심 개념!
	 */
	void run() {
		System.out.println(brand + "스포츠카 시속" + speed + "km/h로 빠르게 달린다.");
	}
}

class Truck extends CarDesign{
	int loadCapacity;
	
	Truck(){
		this("볼보",5000, 80);
	}
	
	Truck(String brand, int loadCapacity, int speed){
		this.loadCapacity = loadCapacity;
		this.brand = brand;
		this.speed = speed;
	}
	void run() {
		System.out.println(brand + "트럭이 "+ loadCapacity +"kg의 용량을 가지고 " + speed + "km/h로 빠르게 달린다.");
	}
}

public class _01_CarDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 부모클래스에는 브랜드와 스피드가 있다. / 생성자로 브랜드와 스피드를 무조건 입력해야 하도록 만들어줌 
		 *    this()사용해서 기본값 만들어줌 - > 현대, 100
		 *    달리는 기능이 있다! 브랜드 : 현대 / 스피드 : 100
		 * 2. 자식 클래스 스포츠가를 만들고 부모 클래스의 기능을 오버라이딩 해서 
		 * 		브랜드 + 스포츠카 speed / km/h로 달립니다!
		 * 3. 트럭도 만들기 적재용량
		 */
		CarDesign nomalCar = new CarDesign();
		nomalCar.run();
		
		SportsCar ferrari = new SportsCar("페라리", 280);
		ferrari.run();
		
		Truck Volvo = new Truck("볼보", 5000, 80);
		Volvo.run();
	}
	
	

}
