package Chapter02;

public class Student extends Person {
	public Student(){
		System.out.println("Student() Called...");
	}
	public Student(int i){
		System.out.println("Student() Called...");
	}
	public void showInfo() {
		System.out.println(age);// �θ��� Default �����ڴ� ���� ��Ű�� ���� �ֱ� ������ ���� ����
		// System.out.println(name); //�θ��� private �����ڴ� ���� �Ұ�
		System.out.println(height); // �θ��� public ���� ����
		System.out.println(weight); // �θ��� protected ���� ����
	}
}