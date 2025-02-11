package day6;

public class _06_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Continue : 뒤에 오는 코드를 무시하고 반복문을 싫애
		int sum = 0;
		for(int i = 0; i <= 100;i++) {
			if(i % 2 != 0) {
				continue;
			}
			sum +=1;
		}
		System.out.println("짝수의 합 : " + sum);
	}

}
