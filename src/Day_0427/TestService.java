package Day_0427;

public class TestService {
	// tr 객체선언
	TestRepository tr = new TestRepository();
	
	 void save(TestDTO test) {
		tr.save(test);	
	}

	 void findById(long choice) {
		System.out.println(choice);
		TestDTO test = tr.findById(choice);
		System.out.println(test);
	}

}
