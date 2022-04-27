package Day_0427;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.
		
		HumanDTO human1 = new HumanDTO(1l,"id",20);
		HumanDTO human2 = new HumanDTO(2l,"id2",30);
		HumanService humanService = new HumanService();
		humanService.save(human1);
		humanService.save(human2);
		
		humanService.findAll();
		
		// id가 1인 사람 조회
		// 조회한 데이터는 Service에서 출력
		humanService.findById(1L);
		
		// id가 1인 사람 삭제
		humanService.remove(1L);
		// 삭제 후 리스트를 가져와서 Service에서 출력
		humanService.findAll();
		
	}

}
