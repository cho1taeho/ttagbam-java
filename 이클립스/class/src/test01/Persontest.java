package test01;

public class Persontest {
	public static void main(String[] args) {
		Person p1 = new Person();// 객체의 생성 : new 키워드 + 생성자 호출
		p1.name = "까마귀";
		p1.age = 30;
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "cat";
		p2.age = 27;
		p2.eat();
		
	
	
	}
}
