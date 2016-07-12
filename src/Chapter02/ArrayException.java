package Chapter02;

public class ArrayException {

	public static void main(String[] args) {
		try { // 변수에 문제가 있을 수 있으므로 코드 전체 감싸기
			int[] intArray = new int[5];
			intArray[0] = 0;

			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i]; // i = 4인 경우 예외 발생
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		} catch (Exception ex) { // 모든 Exception의 부모
			System.out.println("예외 발생 - " + ex); // catch문은 비우지 말것!(비어있으면 실행 시
									             // 에러가 있는지 없는지 알 수 없는 코드가 됨)
			ex.printStackTrace(); // 어디에서 발생했는지까지의 정보를 출력
		}
	}
}
 /* 예외 처리가 필요없는 코드가 제일 좋은 코드!! */