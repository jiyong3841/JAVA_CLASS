package day2;

public class _02_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; //문자열
		int age; //10진정수
		char bloodType; //문자
		
		/*
		 * 변수사용 규칙
		 * 1. 영어 대소문자를 구분한다.
		 * 2. 첫 글자는 숫자로 시작할 수 없음 (일반적으로 소문자로 시작)
		 * 3. 특수문자는 ($,_만 가능) -> *&^#@ 불가능
		 * 4. 자바 예약어(키워드)는 사용 불가
		 * 5. 변수명은 문자 수의 제한이 없다! 변수의 의미를 쉽게 알아볼 수 있도록 구체적으로 이름 지어주기
		 * 6. bloodType -> 카멜표기법 (두개 이상의 단어를 조합하여 명명할 때 두번째 단어부터는 첫글자를 대문자로 표기하는 방법)
		 */
		
		int studentAge; //변수를 선언
		studentAge = 20; // 변수에 값을 대입
		System.out.println(studentAge);
		
		String food = "떡볶이";
		System.out.println(food);
		
		int myAge = studentAge;
		System.out.println(myAge);
		
	}

}
