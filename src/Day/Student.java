package Day;

public class Student {
	// 이름 , 전공 , 학번 ,나이
	String name = " ";
	String major = " " ;
	String studentNumber = " ";
	int age = 0;
	
	Student(){
		
	}
	
	Student(String name, int age){
		this.name = name ;
		this.age = age;
		this.studentNumber = "1234" ;
		this.major = "컴퓨터" ;
	}
	
	Student(String name , String major , String studentNumber , int age){
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
		this.major = major ;
	}
	
	// 필드값 출력을 위한 메서드
	// void = 리턴 할게 없을 경우
	void studentPrint() {
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.studentNumber);
		System.out.println(this.age);
	}
}
