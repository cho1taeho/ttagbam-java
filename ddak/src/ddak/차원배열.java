package ddak;

public class 차원배열 {
	public static void main(String[] args) {
		int[][]arr= new int[3][4];
		
		for(int r=0; r<3; r++) {
			for(int c=0; c<4; c++) {
				System.out.printf("%4d",arr[r][c]);
			}
			System.out.println();
		}
		
		
	}
}
