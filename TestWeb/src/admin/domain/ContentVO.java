package admin.domain;

public class ContentVO {

	String idx;
	String title;
	String director;
	String release;
	String info;
	String url;
	
	public ContentVO()
	{
		
	}

	public ContentVO(String idx, String title, String director, String release, String info, String url) {
		super();
		this.idx = idx;
		this.title = title;
		this.director = director;
		this.release = release;
		this.info = info;
		this.url = url;
	}

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getinfo() {
		return info;
	}

	public void setinfo(String info) {
		this.info = info;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
