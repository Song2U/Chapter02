package Chapter02;

public class MyException extends Exception {
	private static final long serialVersionUID = -2884231505694573143L;	//��ü ID ���� (���� �ʿ�� ��...)
	public MyException(){
		super("���� ���� �׽�Ʈ ����");
	}
	public MyException(String message) {
		super(message);
	}
}