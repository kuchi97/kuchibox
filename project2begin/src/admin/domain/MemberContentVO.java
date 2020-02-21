package admin.domain;

public class MemberContentVO {
	
	String idx;
	String email;
	String name;
	String trailerTitle;
	String reviewTitle;
	String info;
	String url;
	
	public MemberContentVO()
	{
		
	}
	public MemberContentVO(String idx, String email, String name, String trailerTitle, String reviewTitle, String info,
			String url, String contentIdx) {
		super();
		this.idx = idx;
		this.email = email;
		this.name = name;
		this.trailerTitle = trailerTitle;
		this.reviewTitle = reviewTitle;
		this.info = info;
		this.url = url;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrailerTitle() {
		return trailerTitle;
	}
	public void setTrailerTitle(String trailerTitle) {
		this.trailerTitle = trailerTitle;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
