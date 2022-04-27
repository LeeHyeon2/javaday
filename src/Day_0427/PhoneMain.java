package Day_0427;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 새로운 phone 등록 => List에 저장(List는 Repositroy 가 가지고있음
		Phone_DTO phone1 = new Phone_DTO(1L, "아이폰", "123-123", 1000000);

		// Service 클래스에 phone1 객체를 기기 위해 Service 객체를 만들고
		PhoneService phoneService = new PhoneService();
		// Service 클래스가 가지고 있는 save 메서드 호출
		phoneService.save(phone1);

		Long id = 2L;
		String modelName = "갤럭시노트";
		String modelNumber = "1111-2222";
		int price = 220000;

		// phoneService.save(id , modelName , modelNumber , price);

		// list 에 담긴 전체 데이터 조회
		phoneService.findAll();

		Phone_DTO phone2 = new Phone_DTO(2L, "갤럭시", "33333", 2000000);
		phoneService.save(phone2);
		phoneService.findAll();
	}

}
