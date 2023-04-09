package test06_object;

import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("박사홍", 28, "자바");
		st.eat(); // 필요하다면 자식 클래스에서 부모의 메서드를 재정의 할 수 있따.
		
//		st.
		//다형성 
//		Person st2 = new Student("양명균", 29, "자바");
//		st2.eat();
		
		System.out.println(st.toString());
		
		Student st2 = new Student("박사홍", 20, "자바");
		System.out.println(st==st2); // 다른객체
		System.out.println(st.equals(st2));// 다르게 나옴, 주소값을 비교하고 있으니까.
		//이름만 같아도 같다고 Override 했으므로 같아짐
		
		
		
		
		Object o = new Object();
		o.equals(st);
		
		Set<Student> set = new HashSet<>();
		set.add(st);
		set.add(st2);
		
		System.out.println(set.size());// 집합에 들어 있는 원소의 개수
		// set 에서는 동일성을 판단하기 위해서 equals(), hashcode();
	}
}
