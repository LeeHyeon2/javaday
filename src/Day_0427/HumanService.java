package Day_0427;

import java.util.List;

public class HumanService {
	HumanRepository hr = new HumanRepository();

//			  String   a
	void save(HumanDTO human) {
		System.out.println("humanService.save()");
		System.out.println(human);
		hr.save(human);
	}

	void findAll() {
		// HumanRepository에서 리스트를 가져온 후 출력
		List<HumanDTO> humanList = hr.findAll1();
		System.out.println("findAll2() 그대로 출력");
		System.out.println(hr.findAll1());
		System.out.println("findAll2() for문 출력");
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}

	void findById(Long id) {
		System.out.println("넘어온 id값 " + id);
		// Repository로 부터 id가 1L인 HumanDTO객체를 가져옴.
		HumanDTO human = hr.findById(id);
		if (human == null) {
			System.out.println("조회결과가 없습니다.");
		} else {
			System.out.println("조회값 : " + human);			
		}
	}

	public void remove(Long id) {
		List<HumanDTO> humanList = hr.remove(id);
		System.out.println("삭제후 리스트");
		for(HumanDTO human : humanList) {
			System.out.println(human);
		}
	}

	public void changeName(Long id , String name) {
		HumanDTO human = hr.changeName(id,name);
		System.out.println("수정" + human);
		List<HumanDTO> humanList = hr.findAll1();
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}

	public void update(Long id, String name) {
		hr.update(id,name);
		List<HumanDTO> humanList = hr.findAll1();
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
		
	}

}
