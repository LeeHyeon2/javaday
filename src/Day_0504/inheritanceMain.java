package Day_0504;

public class inheritanceMain {
	public static void main(String[] args) {
		// 부모 클래스 객체
		ParentClass parent = new ParentClass();
		ParentClass parent1 = new ParentClass("하츄핑", "인천");

		// 자식 클래스 객체
		ClildClass child = new ClildClass();
		ClildClass child1 = new ClildClass("방글핑", "서울");
		
		// 부모가 가지고 있는 hello 메서드 호출
		child.hello();
		System.out.println(child.getName());
		System.out.println(child1.getName());
		System.out.println(child.name);
		System.out.println(child1.name);

	}
}
