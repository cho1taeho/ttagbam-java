package testclass1;

public class Person {
	static String species = "호모 사피사피";
			
			
			String name;
			int age;
			
			public int add(int a, int b) {
				return a+b;
			}
			// 매서드의 종료
			// -블록의 끝을 만날 때
			// -return 문을 만날때 (void에서도 return 문을 쓸 수 있음
			public void study(String subject) {
				double probability = Math.random();
				
				
				System.out.println(subject+"를 공부합니다.");
				System.out.println("알고리즘 문제를 풉니다.");
				if(probability<0.9999)
					return;
				
				System.out.println("게임을 합니다.");
				System.out.println("lol 영상을 봅니다.");
				
			}
			
			
			
			public void eat() {
				String dish = "짜장면";
			}
}
