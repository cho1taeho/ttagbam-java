package test04;

public class Person {
	static String species = "호모 사피사피";
			
			
			String name;
			int age;
			
			public int add(int a, int b) {
				return a+b;
			}
			public double add(double a, double b) {
				return a+b;
			}
			// 메서드 오버로딩의 장점
			// - 다양한 자료형에 대해 메서드를 만들 때
			// - 이름을 똑같이 할 수 있음
//			public int add(double a, double b) {
//				return(int) a+b;
//			}
			
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
			
			
			//메서드 오버로딩
			public void eat() {
				System.out.println("식사를 합니다.");
			}
			
			
			public void eat(String dish) {
				System.out.println(dish + "를 먹습니다.");
			}
			
			public void eat(String dish, int times) {
				System.out.println(dish+"를 "+times+"번 먹습니다.");
			}
			
			
			
			
}
