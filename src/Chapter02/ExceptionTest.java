package Chapter02;

public class ExceptionTest {
	// try-catch������ ����ó�� �ϴ� ���� ������ �ڵ尡 ���������� �������� ���� ����
	public static void main(String[] args) {
		int a = 5;
		double d = 0.;
		try { // �ǽ� ���� �ڵ�
			d = 10 / a;
		} catch (ArithmeticException ex) { // ����ó��(���ܰ� �߻��ϸ� ����Ǵ� �ڵ�)
			// 1. logging (����, DB)
			System.out.println("error : " + ex);
			// 3. ����ڿ��� �޽���
			System.out.println("�˼��մϴ�. ���α׷��� ���������� ����Ǿ����ϴ�. �ٽ� �������ֽʽÿ�.");
			// 4. ��������
			return;
		}
		/*
		 * System.out.println(d); //���� �߻� �� return������ ����Ǿ��� ������ ������� ���� //������
		 * �ʿ��� ��� finally�� �ξ� ����ǰ� �Ѵ�.
		 */
		finally { // 2. �ڿ� ����
			System.out.println(d);
		}
	}
}