package day10;

//필드
class Student{
	String name;
	int grade;
	int englishScore;
	int mathScore;
	
	// 생성자 추가
	Student(String n, int g, int e, int m){
		name = n;
		grade = g;
		englishScore = e;
		mathScore = m;
		
	}
	
	void info() {
		System.out.println("이름 : " + name + "\n학년 : " + grade + "학년");
		System.out.println("수학점수 : " + mathScore + "\n영어점수 : " + englishScore);
		System.out.println("평균 점수 : " + avg());
	}
	// 평균계산메서드
	public double avg() {
		return (englishScore + mathScore) / 2.0;
	}
	// 정보출력메서드
	public void studentInfo(){
		System.out.println("이름 : " + name + "\n학년 : " + grade + "학년");
		System.out.println("수학점수 : " + mathScore + "\n영어점수 : " + englishScore);
		System.out.println("평균 점수 : " + avg());
	}
	
}
public class _02_MethodStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름 학년, 영어점수, 수학점수, 필드가 들어있는 클래스를 만들고
		 * 평균을 구하는 반환값이 있는 메서드르 만들어서 철수 영희의 정보를 출력해보기 
		 */
		
		Student student1 = new Student("철수",1,80,70);
//		student1.name = "철수";
//		student1.grade = 1;
//		student1.mathScore = 80;
//		student1.englishScore = 70;
		student1.studentInfo();
		
		System.out.println();
		
		Student student2 = new Student("영희", 3, 90, 75);
//		student2.name = "영희";
//		student2.grade = 3;
//		student2.mathScore = 90;
//		student2.englishScore = 75;
		student2.studentInfo();
		
		
		
	}

}
