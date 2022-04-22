package Day;

public class Day_0422_3 {

	public static void main(String[] args) {
		Student Student1 = new Student();
		Student1.name = "일번";
		Student1.major = "기계";
		Student1.studentNumber = "1" ;
		Student1.age = 20;
		
		Student1.studentPrint();
		/*System.out.println(Student1.name);
		System.out.println(Student1.major);
		System.out.println(Student1.studentNumber);
		System.out.println(Student1.age); */
		
		System.out.println("----------------------");
		
		Student Student2 = new Student("이번",22);
		/*System.out.println(Student2.name);
		System.out.println(Student2.major);
		System.out.println(Student2.studentNumber);
		System.out.println(Student2.age);
*/
		Student2.studentPrint();
		System.out.println("----------------------");
		
		Student Student3 = new Student("삼번" , "전기" , "3" , 33);
	/*	System.out.println(Student3.name);
		System.out.println(Student3.major);
		System.out.println(Student3.studentNumber);
		System.out.println(Student3.age);
	*/	
		Student3.studentPrint();
	}

}
