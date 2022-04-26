package Day;

import java.util.Scanner;

public class Day_0425_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Cal cal1 = new Cal();

		int num1 = 0, num2 = 0, choice = 0;

		do {
			System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료");
			choice = scan.nextInt();
			if(choice ==1) {
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				cal1.sum(num1, num2);
			}else if(choice == 2) {
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				cal1.subtraction(num1, num2);
			}else if(choice == 3) {
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				int result = cal1.multuplication(num1, num2);
				System.out.println(result);
			}else if(choice == 4) {
				System.out.println(cal1.division());
			}else if(choice == 5) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("올바른 숫자를 입력하세요");
			}
		} while (true);

	}

}
