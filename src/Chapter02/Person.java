package Chapter02;

public class Person {
	public Person(){
		System.out.println("Person() called...");
	}
	public Person(int i){
		System.out.println("Person(int i) called...");
	}
	int age;	//default
	private String name; // 은닉으로 지정
	public int height;
	protected int weight;
}