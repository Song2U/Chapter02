package Chapter02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String str;
			str = br.readLine();

			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}