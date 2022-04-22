package Day;

public class Human {
	// 이름 , 나이 , 지역 , 성별 
	String name = " ";
	int age = 0 ;
	String local = " ";
	String gender ;
	
	// 생성자 선언
	Human() {
		System.out.println("생성자 호출됨");
	}
	// 필드값을 세팅하기 위해 매개변수가 있는 생성자 선언
	Human(String name , int age , String local , String gender){;
		// 매개변수로 전달받은 값을 필드에 저장
		this.name = name;
		this.age = age;
		this.local = local;
		this.gender = gender;
	}
	// 매개변수가 있는 생성자
	Human(String str1){
		System.out.println("넘겨받은 값은" + str1);
	}
	
	//Human(String str2){
	//	System.out.println("넘겨받은 값은" + str2);
	//}
	// int 매개변수가 있는 생성자
	Human(int num1){
		System.out.println("넘겨받은 값은" + num1);
	}
	
}
