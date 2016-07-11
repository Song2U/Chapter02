package Chapter02;

public class StudentTest {

	public static void main(String[] args) {
		Person p = new Student(); // 기본 생성자 호출
								  //(자식이 생성 될 때 부모 생성자를 부르는데 특별히 명시해주지 않으면(뭘 불러올지 적어주지 않으면)기본 생성자 호출)
								  // 기본 생성자여서 부모의 기본 생성자를 불러오는 것이 아님
	}
}
