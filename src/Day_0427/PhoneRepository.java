package Day_0427;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository {
	
	static List<Phone_DTO> phoneList = new ArrayList<>();
	
	void save(Phone_DTO phone) {
		System.out.println("PhoneRepository.save()");
		System.out.println(phone);
		phoneList.add(phone);
		
	}

	void findAll() {
		System.out.println("PhoneRepository.findAll()");
		for(Phone_DTO p:phoneList) {
			System.out.println(p);
		}
	}
	// findAll1 메서드 정의
	// 리턴 : phoneList
	List<Phone_DTO> findAll1() {
		return phoneList;
	}
}
