package Day_0427;

import java.util.List;

public class PhoneService {


	void save(Phone_DTO phone) {
		System.out.println("PhoneService.save()");
		System.out.println(phone);
		PhoneRepository pr = new PhoneRepository();
		pr.save(phone);
	}

	void findAll() {
		System.out.println("PhoneService.finAll()");
		PhoneRepository pr = new PhoneRepository();
		// Repository에서 목록을 출력
		pr.findAll();
		// Repository에서 리스트를 가져와서 여기서 출력
		List<Phone_DTO> phoneList = pr.findAll1();
		System.out.println("PhoneService.fineAll() for문");
		for (Phone_DTO p : phoneList) {
			System.out.println(p);
		}
	}	
}
