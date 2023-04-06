package ddak;

import java.util.Arrays;

public class 배열3 {
	public static void main(String[] args) {
		int[] scores = new int[]{29, 45, 67, 84, 92};
		
		int[] newScores = new int[10];
		for(int i=0; i<5; i++) {
			newScores[i] = scores[i];
		}
		System.out.println(Arrays.toString(newScores));
		
		int[] newScores2 = Arrays.copyOf(scores, scores.length *2);
		System.out.println(Arrays.toString(newScores2));
		
		
		
		
		
	}
}
