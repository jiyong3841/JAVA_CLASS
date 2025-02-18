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
}


public class _06_Succession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog mydog = new Dog();
		mydog.eat();
		mydog.sound();
	}

}
