package Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PostService {
	Scanner scan = new Scanner(System.in);
	LocalDateTime dateTime = LocalDateTime.now();
	PostRepository pr = new PostRepository();
	// static Long id = 0l;
	void save() {

		// 글번호
		Long id = 0l;

		System.out.print("제목 입력 : ");
		String postTitle = scan.next();
		System.out.print("작성자 입력 : ");
		String postWriter = scan.next();
		System.out.print("비밀번호 입력 : ");

		String postPass = scan.next();
		System.out.print("내용 입력 : ");
		String postContents = scan.next();
		// 조회수
		Integer postHits = 0;
		// 작성시간
		String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));

		PostDTO pd = new PostDTO(id, postTitle, postWriter, postPass, postContents, postHits, time);
		//PostDTO pd = new PostDTO(++id, postTitle, postWriter, postPass, postContents, postHits, time);
		Boolean result = pr.save(pd);
		if(result) {
			System.out.println("글 등록 완료");
		}else {
			System.out.println("글 등록 실패");
		}
	}

	void findAll() {
		pr.findAll();
		System.out.println();
	}

	void findById() {	
		System.out.print("조회 할 글번호 입력 : ");
		Long id = scan.nextLong();
		Boolean idCheck = pr.idCheck(id);
		if (idCheck) {
			pr.findById(id);
		} else {
			System.out.println("조회결과가 없습니다.");
		}
	}

	void change() {
		System.out.print("수정 할 글번호 입력 : ");
		Long id = scan.nextLong();
		System.out.print("수정 할 글번호의 비밀번호 입력 : ");
		String password = scan.next();
		Boolean login = pr.login(id, password);
		Boolean idCheck = pr.idCheck(id);
		if (login) {
			System.out.print("수정 할 제목 입력 : ");
			String postTitle = scan.next();
			System.out.print("수정 할 내용 입력 : ");
			String postContents = scan.next();
			pr.change(id, postTitle, postContents);
		} else if (idCheck) {
			System.out.println("글번호와 비밀번호가 일치하지 않습니다.");
		} else {
			System.out.println("존재하지 않는 글번호 입니다");
		}

	}

	void findWriter() {
		System.out.print("조회 할 작성자 입력 : ");
		String Writer = scan.next();
		pr.findWriter(Writer);
	}

	void remove() {
		System.out.print("삭제 할 글번호 입력 : ");
		Long id = scan.nextLong();
		Boolean idCheck = pr.idCheck(id);
		if (idCheck) {
			pr.remove(id);
		} else {
			System.out.println("존재하지 않는 글번호 입니다.");
		}

	}

}
