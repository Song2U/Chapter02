package Chapter02;

public class ArrayUtils {
	// 1. ArrayUtils.intToDouble(...) 테스트
	public static double[] intToDouble(int[] arrayInt) {
		if (arrayInt == null) {
			return null;
		}

		int length = arrayInt.length; // 길이를 변수로 지정
		double[] arrayDouble = new double[length];

		for (int i = 0; i < arrayInt.length; i++) {
			arrayDouble[i] = (double) arrayInt[i];
		}
		return null;
	}

	// 2. ArrayUtils.doubleToInt 테스트
	public static int[] doubleToInt(double[] arrayDouble) {
		if (arrayDouble == null) {
			return null;
		}

		int length = arrayDouble.length;
		int[] arrayInt=new int[length];

		for (int i = 0; i < arrayDouble.length; i++) {
			arrayInt[i] = (int) arrayDouble[i];
		}
		return null;
	}
	// 3. ArrayUtils.concat 테스트
	public static int[] concat(int[] arrayInt1, int[] arrayInt2){
		int[] ccResult={};
		if(arrayInt1==null){
			if(arrayInt2==null){
				return null;
			}return arrayInt2;
		}
		for(int i=0;i<arrayInt1.length;i++){
			ccResult[i] = arrayInt1[i];
		}for(int j=0;j<arrayInt2.length;j++){
			ccResult[j+3]=arrayInt2[j];
		}
		return null;
	}
}