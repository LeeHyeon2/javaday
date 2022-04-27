package Day_0427;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-> 정보추가 2-> id조회 3-> id삭제

		Long id;
		String name;
		int age;
		while (true) {
			System.out.print("선택 >");
			int check = scan.nextInt();
			// 1번 실행
			if (check == 1) {
				System.out.print("id 입력 : ");
				id = scan.nextLong();
				System.out.print("name 입력 : ");
				name = scan.next();
				System.out.print("age 입력 : ");
				age = scan.nextInt();

				// 입력받은 값 DTO에 들어감
				TestDTO test = new TestDTO(id, name, age);
				// 저장을 위해 객체선언
				TestService ts = new TestService();
				// 값 저장
				ts.save(test);
			} // 2번실행
			else if (check == 2) {
				TestService ts = new TestService();
				long choice = scan.nextLong();
				ts.findById(choice);
				
			}
		}
	}

}
