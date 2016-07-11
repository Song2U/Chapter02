package Chapter02;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		// 1. ArrayUtils.intToDouble(...) �׽�Ʈ
		int[] arrayInt1 = { 10, 20, 30, 40, 50 };	//�迭�� ������ (���̸� ��Ƶξ�� ��)
		double[] arrayDouble1 = ArrayUtils.intToDouble(arrayInt1);

		for (double d : arrayDouble1) {
			System.out.println(d);
		}
		// 2. ArrayUtils.doubleInt(...) �׽�Ʈ
		double[] arrayDouble2 = { 10.1, 20.2, 30.3, 40.4, 50.5 };
		int[] arrayInt2 = ArrayUtils.doubleToInt(arrayDouble2);
		for (int i : arrayInt2) {
			System.out.println(i);
		}
		// 3. ArrayUtils.concat(...) �׽�Ʈ
		int[] arrayInt3 = { 1, 2, 3 };
		int[] arrayInt4 = { 4, 5, 6 };
		int[] arrayCcResult=ArrayUtils.concat(arrayInt3, arrayInt4);
		System.out.println(arrayCcResult);
	}
}