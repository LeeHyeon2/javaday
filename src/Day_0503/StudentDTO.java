package Day_0503;

public class StudentDTO {
	Long id;
	String name;
	String phNum;
	String main;
	public StudentDTO(Long id, String name, String phNum, String main) {
		this.id = id;
		this.name = name;
		this.phNum = phNum;
		this.main = main;
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
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", phNum=" + phNum + ", main=" + main + "]";
	}
	public String getPhNum() {
		return phNum;
	}
	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	
	
}
