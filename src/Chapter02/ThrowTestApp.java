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

	public static void test() throws IOException, MyException {// Exception�� ȸ�� (���� ����� �ƴ�) - �ڵ带 ����ϰ� �ϱ�����
		ThrowTest tt = new ThrowTest();
		tt.suspiciousMethod();
	}
}