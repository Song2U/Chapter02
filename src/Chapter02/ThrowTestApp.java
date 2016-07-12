package Chapter02;

import java.io.IOException;

public class ThrowTestApp {

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void test() throws IOException, MyException {// Exception의 회피 (좋은 방법은 아님) - 코드를 깔끔하게 하기위함
		ThrowTest tt = new ThrowTest();
		tt.suspiciousMethod();
	}
}