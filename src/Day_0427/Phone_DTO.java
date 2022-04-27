package Day_0427;

public class Phone_DTO {
	private Long id;
	private String modelName;
	private String modelNumber;
	private int price;
	
	//기본생성자
	Phone_DTO(){
		
	}

	// 매개변수 있는 생성자
	public Phone_DTO(Long id, String modelName, String modelNumber, int price) {
		this.id = id;
		this.modelName = modelName;
		this.modelNumber = modelNumber;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone_DTO [id=" + id + ", modelName=" + modelName + ", modelNumber=" + modelNumber + ", price=" + price
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
