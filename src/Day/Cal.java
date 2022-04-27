package Day;

import java.util.Scanner;

public class Cal {
	Scanner scan = new Scanner(System.in);

	void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	void subtraction(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}

	int multuplication(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	int division() {
		System.out.print("111첫 번째 숫자: ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자: ");
		int num2 = scan.nextInt();
		int result = num1 / num2;
		return result;
	}

}
