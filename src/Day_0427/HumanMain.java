package Day_0427;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.
		
		HumanDTO human1 = new HumanDTO(1l,"id",20);
		HumanDTO human2 = new HumanDTO(2l,"id2",30);
		HumanDTO human3 = new HumanDTO(3l,"id3",40);
		HumanService humanService = new HumanService();
		humanService.save(human1);
		humanService.save(human2);
		humanService.save(human3);
		
		
		humanService.findAll();
		
		// id가 1인 사람 조회
		// 조회한 데이터는 Service에서 출력
		humanService.findById(1L);
		
		// id가 1인 사람 삭제
		humanService.remove(1L);
		// 삭제 후 리스트를 가져와서 Service에서 출력
		humanService.findAll();
		
		// id가 3인 사람의 이름을 자바왕 으로 바꾸자
		humanService.changeName(3l , "자바왕");
		humanService.update(2l,"바꾸기");
		
	}

}
