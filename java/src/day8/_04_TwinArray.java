package day8;

public class _04_TwinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][4];
		
		a[1][2] = 99;
		a[2][1] = 123;
		a[3][3] = a[1][2] * a[2][1];
		
		System.out.println("a[3][3] = " + a[3][3]);
		
		for(int i = 0; i < a.length; i++) {//행의 길이
			for(int j = 0; j < a[i].length; j++) { //열의 길이
				System.out.print(a[i][j] + " ");
			}
		}
		
		System.out.println("");
		
		int [][] b = new int[3][];//행의 값만 작성함 (행의 크기는 지정해야함!)
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[1];
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j <b[i].length; j++) {
				System.out.print
				(b[i][j] + " ");
			}
			System.out.println("");
			
		}
	}

}
