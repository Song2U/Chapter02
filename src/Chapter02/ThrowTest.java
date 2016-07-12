package Chapter02;

import java.io.IOException;

public class ThrowTest {
	public void suspiciousMethod() throws MyException {
		System.out.println("예외 발생 전");
		if (true) {
			throw new MyException("hello my exception");	
		}
		System.out.println("예외 발생 후");
	}
}