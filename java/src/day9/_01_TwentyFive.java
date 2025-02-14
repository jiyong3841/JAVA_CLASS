package day9;

public class _01_TwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2차원 배열 생성 후 각각의 칸에 1부터 25까지 넣기!
		 */
		
		int [][] arr = new int[5][5];
		int num = 0;
		
		for (int i =0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++){
				arr[i][j] = num++;
				System.out.print(num + " ");
			}
			System.out.println("");
		}
	}

}
