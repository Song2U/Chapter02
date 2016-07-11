package Chapter02;

public class Student extends Person {
	public Student(){
		System.out.println("Student() Called...");
	}
	public Student(int i){
		System.out.println("Student() Called...");
	}
	public void showInfo() {
		System.out.println(age);// 부모의 Default 접근자는 같은 패키지 내에 있기 때문에 접근 가능
		// System.out.println(name); //부모의 private 접근자는 접근 불가
		System.out.println(height); // 부모의 public 접근 가능
		System.out.println(weight); // 부모의 protected 접근 가능
	}
}