package Day_0427;

public class TestDTO {
	private Long id;
	private String name;
	private int age;
	
	TestDTO(){
		
	}
	
	public TestDTO(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "가입정보 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
