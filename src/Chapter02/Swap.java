package Chapter02;

//7/7 05. 스택?
public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// int c = add(a, b);

		System.out.println(a + ", " + b);
		swap(a, b);
		System.out.println(a + ", " + b);
		Value v1 = new Value();
		v1.setVal(10);
		Value v2 = new Value();
		v2.setVal(20);
		System.out.println(v1 + ", " + v2);
		swap(v1, v2);
		System.out.println(v1 + ", " + v2);
	}

	// call by value : 함수를 값으로써 호출
	// call by reference : 함수를 포인터?로써 호출

	public static int add(int i, int j) {
		int result = i + j;
		return result;
	}

	public static void swap(Value val1, Value val2) {// Overloading
		int temp = val1.getVal();
		val1.setVal(val2.getVal());
		val2.setVal(temp);
	}

	public static void swap(int i, int j) { // 객체 안에 들어가는 값만 변경 가능
		int temp = i;
		i = j;
		j = temp;
		System.out.println(i + ", " + j);
	}
	
}