package Chapter02;

public class MyException extends Exception {
	private static final long serialVersionUID = -2884231505694573143L;	//객체 ID 지정 (딱히 필요는 없...)
	public MyException(){
		super("내가 만든 테스트 예외");
	}
	public MyException(String message) {
		super(message);
	}
}