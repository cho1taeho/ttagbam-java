package test05_binding;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("박사홍", 28, "자바");
		st.eat(); // 필요하다면 자식 클래스에서 부모의 메서드를 재정의 할 수 있따.
		
		
//		st.
		//다형성 
		Person st2 = new Student("양명균", 29, "자바");
		st2.eat();
		
		
	}
}
