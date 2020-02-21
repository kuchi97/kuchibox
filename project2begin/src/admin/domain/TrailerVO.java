package admin.domain;

public class TrailerVO {

	/* property */
	String div;		//구분
	String genre;	//장르
	String num;		//등록번호
	String idx;		//구분+장르+등록번호
	String api_idx;
	String url;
	String title;
	int good;
	int click;
	int zzim;
	String email;
	
	/* constructor */
	public TrailerVO() {
		
	}
	public TrailerVO(String div, String genre, String num, String idx, String api_idx, String url, String title,
			int good, int click, int zzim, String email) {
		super();
		this.div = div;
		this.genre = genre;
		this.num = num;
		this.idx = idx;
		this.api_idx = api_idx;
		this.url = url;
		this.title = title;
		this.good = good;
		this.click = click;
		this.zzim = zzim;
		this.email = email;
	}
	
	
	/* setter,getter */
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = div+genre+num;
	}
	public String getApi_idx() {
		return api_idx;
	}
	public void setApi_idx(String api_idx) {
		this.api_idx = api_idx;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public int getZzim() {
		return zzim;
	}
	public void setZzim(int zzim) {
		this.zzim = zzim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
