package Chapter02;

public class ArrayException {

	public static void main(String[] args) {
		try { // ������ ������ ���� �� �����Ƿ� �ڵ� ��ü ���α�
			int[] intArray = new int[5];
			intArray[0] = 0;

			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i]; // i = 4�� ��� ���� �߻�
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		} catch (Exception ex) { // ��� Exception�� �θ�
			System.out.println("���� �߻� - " + ex); // catch���� ����� ����!(��������� ���� ��
									             // ������ �ִ��� ������ �� �� ���� �ڵ尡 ��)
			ex.printStackTrace(); // ��𿡼� �߻��ߴ��������� ������ ���
		}
	}
}
 /* ���� ó���� �ʿ���� �ڵ尡 ���� ���� �ڵ�!! */