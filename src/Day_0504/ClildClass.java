package Day_0504;

public class ClildClass extends ParentClass {

	ClildClass() {
		System.out.println("자식 기본생성자");
	}

	ClildClass(String name, String address) {
		System.out.println("자식 매개변수 생성자");
		this.name = name;
		this.address = address;
	}
	
	// 메서드 오버라이딩(재정의)
	// @Overid //자바를 실행하고 컴파일할때 @:어노텐션Annotation -> 부모클래스와 이름이 같은 메서드여양함
	public void hello() {
		System.out.println("지식 hello 메서드	");
	}
	
	
	
	
	
	
}
