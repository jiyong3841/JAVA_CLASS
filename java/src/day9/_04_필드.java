package day9;

class Student{
	String name;
	int age;
	static String school = "떡잎마을방범대";
	
	public void printInfo() {
		/*
		 * public : 접근제한자의 종류
		 * 1. public : 어디에서나 접근 가능! / 다른 패키지에서도 접근 가능
		 * 2. private : 해당 클래스 내부에서만 접근 가능 / 외부에서 절대 사용 불가
		 * 3. protected : 같은 패키지에 있는 클래스나 상속받은 클래스에만 접근 간으
		 * 현재 public을 사용해서 어디에든지 접근 가능함
		 */
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학교 : " + school);
	}
}


public class _04_필드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 필드 종류 
		 * 1. 인스턴스필드 : 객체가 생성될때마다 각각 독립적으로 생성되는 필드이며 객체마다 고유한 값을 가질 수 있다. 
		 * 					예시 도토리 ,
		 * 2. 정적필드  : 클래스가 로드될 때 단 한번 생성되며, 모든 객체가 공유하는 필드
		 * 				 	예시 모든 학생이 다니는 학교 이름
		 */
		
		Student student1 = new Student();
		student1.name = "짱구";
		student1.age = 15;
		Student student2 = new Student();
		student2.name = "철수";
		student2.age = 18;
		Student student3 = new Student();
		student3.name = "맹구";
		student3.age = 20;
		Student student4 = new Student();
		student4.name = "훈이";
		student4.age = 17;
		Student student5 = new Student();
		student5.name = "유리";
		student5.age = 19;
		
		student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student4.printInfo();
        student5.printInfo();
		
		
	}
	

}
