package day11;

class Animal {
	void eat() {
		System.out.println("밥을 먹자 냠냠");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("멍멍!");
	}
	
	void eat() {
		System.out.println("밥을먹자멍멍멍~~~");
	}
}	
class Cat extends Animal{
	void sound(){
		System.out.println("야옹~");
	}
	void eat() {
		System.out.println("밥을먹자냥냥냥~~~");
	}
}


public class _06_Succession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog mydog = new Dog();
		mydog.eat();
		mydog.sound();
		
		Cat mycat = new Cat();
		mycat.eat();
		mycat.sound();
	}

}
