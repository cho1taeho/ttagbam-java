package test02_inheritance;


//클래스의 상속은 extends 키워드를 사용한다.

public class Student extends Person{
	
	String major;
	
	//파라미터가 있는 생성자를 만들어 줘야 한다.
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		
	}
	
	
	public void study() {
		System.out.println("공부를 한다.");
	}
	
}
