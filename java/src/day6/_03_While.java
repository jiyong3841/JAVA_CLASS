package day6;

public class _03_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i <= 10) {
			System.out.println("안녕하세요" + i);
			i++;
		}
		
		int j = 1;
		while(j <= 9) {
			System.out.printf("6 X %d = %d ", j,j*6);
			j++;
			System.out.println();
		}
		j = 1;
		while(j <= 60) {
			if(j % 6 == 0) {
				System.out.println(j);
			}
			j++;
		}
		
		int sum = 0;
		int k = 1;
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("합계 : "+sum);
		
	}

}
