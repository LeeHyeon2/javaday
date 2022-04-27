package Day_0427;

import java.util.ArrayList;
import java.util.List;

public class HumanRepository {
	
	static List<HumanDTO> humanList = new ArrayList<>();

	void save(HumanDTO human) {
		System.out.println("HumanRepository.save()");
		System.out.println(human);
		humanList.add(human);
	}

	void findAll() {
		for(HumanDTO h:humanList) {
			System.out.println(h);
		}
		
	}

	List<HumanDTO> findAll1() {
		return humanList;
	}

	HumanDTO findById(Long id) {
		// id값과 일치하는 객체를 찾음
		HumanDTO human = new HumanDTO();
		for(int i =0 ; i<humanList.size();i++) {
			if(id.equals(humanList.get(i).getId())) {
				human = humanList.get(i);
			}
		}
		return human;
	}

	 HumanDTO remove(Long id) {
		HumanDTO human = new HumanDTO();
		for(int i =0 ; i<humanList.size();i++) {
			if(id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
			}
		}
		
		return human;
	}

	 

	 
}
