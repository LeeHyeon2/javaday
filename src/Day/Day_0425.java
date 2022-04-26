package Day;

import java.util.Scanner;

public class Day_0425 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cal cal1 = new Cal();				

		int num1 = 0, num2 = 0, choice = 0;

		do {
			System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료");
			choice = scan.nextInt();
			if (choice == 5) {
				System.out.println("종료");
				break;
			} else if (choice == 4) {
				int result = cal1.division();
				System.out.println(result);
				continue;
			} else if (choice != 1 && choice != 2 && choice != 3) {
				System.out.println("올바른 숫자를 입력해주세요");
				continue;
			}
			System.out.print("첫 번째 숫자: ");
			num1 = scan.nextInt();
			System.out.print("두 번째 숫자: ");
			num2 = scan.nextInt();
			if (choice == 1) {
				cal1.sum(num1, num2);
			} else if (choice == 2) {
				cal1.subtraction(num1, num2);
			} else if (choice == 3) {
				int result = cal1.multuplication(num1, num2);
				System.out.println(result);
			}
		} while (true);
	}

}
