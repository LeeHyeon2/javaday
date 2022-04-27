package Day_0426;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		// getter/setter 사용전
		// student1.id = 1L; // field 값 지정
		// System.out.println(student1.id); //fueld 값 출력

		// getter/setter 적용
		student1.setId(1L);
		System.out.println(student1.getId());

		Student student2 = new Student();
		student2.setId(2L);
		student2.setStudentNumber("11223344");
		student2.setStudentName("학생1");
		student2.setStudentMajor("컴퓨터공학");
		System.out.println(student2.getId());
		System.out.println(student2.getStudentNumber());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentMajor());

		// Student 객체를 담기 위한 list
		List<Student> studentList = new ArrayList<>();
		studentList.add(student2);
		// get
		System.out.println("객체출력" + student2);
		System.out.println("리스트에 객체만 출력" + studentList.get(0));
		// 0번인덱스에 담긴 Student 객체의 id값을 출력한다면
		System.out.println(studentList.get(0).getId());

		Student student3 = new Student();
		student3.setId(2L);
		student3.setStudentNumber("11223344");
		student3.setStudentName("학생2");
		student3.setStudentMajor("컴퓨터공학");
		studentList.add(student3);

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getStudentName());
		}
		
		for(Student stu: studentList) {
			System.out.println(stu.getStudentName());
		}
		
		Student[] stuArray = new Student[10];
		stuArray[0] = student1;
		
		
		
	}

}
