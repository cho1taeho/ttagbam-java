package ddak;

import java.util.Arrays;

public class 빈도수 {
	public static void main(String[] args) {
		int[] arr= {3,7,2,5,7,7,9,2,8,1,1,5,3};
		
		int[] cnt = new int[10];
			
		for(int num:arr) {
			cnt[num]++;
		}
		System.out.println(Arrays.toString(cnt));
	}
}
