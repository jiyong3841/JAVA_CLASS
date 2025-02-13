package day8;

public class _02_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(자료형 변수명 : 배열){
		 * 		반복할 코드
		 * }
		 * 배열의 모든 요소를 변수명으로 자동으로 순회한다.
		 */
		
		int[] numbers = {10,20,30,40,50};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("배열 요소 : " + numbers[i]);
		}
		
		for(int num:numbers) {
			System.out.println("향상된 for문으로 도는 배열 : " + num);
		}
		
		/*
		 * Apple, Banana, Grape 배열 선언 후 향상된 for문으로 돌리기
		 */
		
		String[] fruits = {"Apple", "Banana", "Grape"};
		for(int j = 0; j < fruits.length; j++) {
			System.out.println("배열 요소 : "+ fruits[j]);
		}
		
		for(String Fruit:fruits) {
			System.out.println("과일 이름 배열 : " + Fruit);
		}
		
		
		
	}

}
