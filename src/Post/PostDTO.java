package Post;

public class PostDTO {

	Long id;
	String postTitle;
	String posWriter;
	String postPass;
	String postContents;
	Integer postHits;
	String time;

	public PostDTO(Long id, String postTitle, String posWriter, String postPass, String postContents, Integer postHits,
			String time) {

		this.id = id;
		this.postTitle = postTitle;
		this.posWriter = posWriter;
		this.postPass = postPass;
		this.postContents = postContents;
		this.postHits = postHits;
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPosWriter() {
		return posWriter;
	}

	public void setPosWriter(String posWriter) {
		this.posWriter = posWriter;
	}

	public String getPostPass() {
		return postPass;
	}

	public void setPostPass(String postPass) {
		this.postPass = postPass;
	}

	public String getPostContents() {
		return postContents;
	}

	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}

	public Integer getPostHits() {
		return postHits;
	}

	public void setPostHits(Integer postHits) {
		this.postHits = postHits;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "PostDTO [id=" + id + ", postTitle=" + postTitle + ", posWriter=" + posWriter + ", postPass=" + postPass
				+ ", postContents=" + postContents + ", postHits=" + postHits + ", time=" + time + "]";
	}

}
