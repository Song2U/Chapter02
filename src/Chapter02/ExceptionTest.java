package Chapter02;

public class ExceptionTest {
	// try-catch문으로 예외처리 하는 것은 좋지만 코드가 복잡해져서 가독성이 좋지 않음
	public static void main(String[] args) {
		int a = 5;
		double d = 0.;
		try { // 의심 가는 코드
			d = 10 / a;
		} catch (ArithmeticException ex) { // 예외처리(예외가 발생하면 실행되는 코드)
			// 1. logging (파일, DB)
			System.out.println("error : " + ex);
			// 3. 사용자에게 메시지
			System.out.println("죄송합니다. 프로그램이 비정상으로 종료되었습니다. 다시 실행해주십시오.");
			// 4. 정상종료
			return;
		}
		/*
		 * System.out.println(d); //예외 발생 시 return문으로 종료되었기 때문에 실행되지 않음 //실행이
		 * 필요한 경우 finally를 두어 실행되게 한다.
		 */
		finally { // 2. 자원 정리
			System.out.println(d);
		}
	}
}