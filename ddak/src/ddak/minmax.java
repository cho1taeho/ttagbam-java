package ddak;

public class minmax {
	public static void main(String[] args) {
		int[] intarray = {3, 15, 564, 45, 186, 153};
		
		int min = 1000;
		int max = 0;
		for(int num : intarray) {
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
		}
		System.out.printf("min: %d, max:%d%n", min, max);
		
	}
}
