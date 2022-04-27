package Day_0427;

import java.util.ArrayList;
import java.util.List;

public class TestRepository {
	// 리스트 선언
	static List<TestDTO> testList = new ArrayList<>();

	// 리스트에 값 저장
	void save(TestDTO test) {
		// list.add(값);
		testList.add(test);
		System.out.println(test);
	}

	TestDTO findById(long choice) {
		TestDTO test = new TestDTO();
		for (int i = 0; i < testList.size(); i++) {
			if (test.equals(testList.get(i).getId())) {
				test = testList.get(i);
			}
		}

		return test;
		
	}

}
