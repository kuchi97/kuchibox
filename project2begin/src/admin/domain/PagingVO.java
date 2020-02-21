package admin.domain;

/* 즐거운 수학나라: 페이지 블록을 구해보자

	[1][2][3][4][5] | [6][7][8][9][10] | [11][12][13][14][15] | ...
	
	cpage					pagingBlock			prevBlock			nextBlock
	1 2 3 4 5					5					x					6
	6 7 8 9 10					5					5					11
	11 12 13 14 15				5					10					16
	16...						...					...					...
	
	(cpage-1)/pagingBlock
		0
		1
		2
		3
		...
	
	따라서, 법칙을 찾아보면
	prevBlock= ((cpage-1)/pagingBlock)*pagingBlock
	nextBlock= prevBlock+(pagingBlock+1)
	
	= 기타 페이징처리 공식들
	
	pageCount=(totalCount-1)/pageSize+1;	//페이지 수 구하는 공식
	if(cpage<=0) {
		cpage=1;			//페이지가 1보다 작을때 무조건 1페이지 보임
	}
	if(cpage>pageCount) {
		cpage=pageCount;	//페이지 최대수보다 많게 입력될때 무조건 마지막페이지 보임
	}
*/

public class PagingVO {

	/* property */
	//페이징 처리 관련 프로퍼티
	private int cpage= 1;			//현재페이지
	private int pageSize= 10;		//한페이지당 게시글 수
	private int totalCount;			//총 게시글
	private int pageCount;			//페이지 수
	
	//DB에서 레코드 끊어올 start, end
	private int start, end;
	
	//페이지 블럭처리용 프로퍼티
	private int pagingBlock= 10;		//한 블럭에 보여줄 페이지 개수
	private int prevBlock;
	private int nextBlock;
	
	//검색관련 프로퍼티
	private String selectBox;
	private String searchInput;
	
	/* constructor */
	public PagingVO() {
		
	}
	public PagingVO(int cpage, int pageSize, int pagingBlock) {
		this.cpage= cpage;
		this.pageSize= pageSize;
		this.pagingBlock= pagingBlock;		
	}
	public PagingVO(int totalCount, int cpage, int pageSize, int pagingBlock) {
		this.totalCount= totalCount;
		this.cpage= cpage;
		this.pageSize= pageSize;
		this.pagingBlock= pagingBlock;

		//페이징처리 연산수행할 메소드
		init();
	}

	/* 페이징 로직수행하는 메소드 */
	public void init() {
		
		pageCount= (totalCount-1)/pageSize+1;		//페이지 수를 구하는 공식
		//페이지가 0보다 작거나 최대페이지를 넘어갈때 처리
		if(cpage<1) {
			cpage=1;
		}
		if(cpage>pageCount) {
			cpage=pageCount;
		}
		
		end= cpage * pageSize;
		start= end - (pageSize - 1);
		
		//페이지블럭 구하는 공식
		prevBlock= ((cpage - 1) / pagingBlock) * pagingBlock;
		nextBlock= prevBlock + (pagingBlock + 1);
	}//--init();
	
	/* 페이지 내비게이션 작성하는 메소드 */
	public String getPageNavi(String myctx, String loc, boolean isParam) {
		//myctx: 컨텍스트
		//loc: 경로
		//qStr: 쿼리스트링(검색할때 필요
		
		selectBox= (selectBox==null)?"":selectBox;
		searchInput= (searchInput==null)?"":searchInput;
		
		String qStr="?selectBox="+selectBox+"&searchInput="+searchInput;
		String qStr2="&selectBox="+selectBox+"&searchInput="+searchInput;
		//String의 불변성때문에 StringBuffer 또는 StringBuilder를 이용한다
		
		StringBuffer buffer= new StringBuffer();
		String str= null;
		//문자열을 편집할 버퍼
		
		if(isParam==false) {		//쿼리스트링으로 파라미터를 넘겨준것이 아닐때
			//html 작성 시작----
			if(prevBlock>0) {	//이전 5개
				buffer.append("<a href='"+myctx+"/"+loc+qStr+"&cpage="+prevBlock+"' class='page' style='margin-right:20px;'>Prev</a>");
			}
			
			for(int i=prevBlock+1; i<=nextBlock-1 && i<=pageCount; i++) {
				if(i==cpage) {
					buffer.append("<a href='#' class='page active'>"+i+"</a>");
					//현재 활성화된 페이지. href를 막아둠
				}
				else {
					buffer.append("<a href='"+myctx+"/"+loc+qStr+"&cpage="+i+"' class='page'>"+i+"</a>");
				}
			}
			
			if(nextBlock<=pageCount) {		//이후 5개
				buffer.append("<a href='"+myctx+"/"+loc+qStr+"&cpage="+nextBlock+"' class='page' style='margin-left:20px;'>Next</a>");
			}
			//---html 작성 끝
			
			str= buffer.toString();
//			System.out.println(str);
			
		}
		else {
			//html 작성 시작----
			if(prevBlock>0) {	//이전 5개
				buffer.append("<a href='"+myctx+"/"+loc+qStr2+"&cpage="+prevBlock+"' class='page' style='margin-right:20px;'>Prev</a>");
			}
			
			for(int i=prevBlock+1; i<=nextBlock-1 && i<=pageCount; i++) {
				if(i==cpage) {
					buffer.append("<a href='#' class='page active'>"+i+"</a>");
					//현재 활성화된 페이지. href를 막아둠
				}
				else {
					buffer.append("<a href='"+myctx+"/"+loc+qStr2+"&cpage="+i+"' class='page'>"+i+"</a>");
				}
			}
			
			if(nextBlock<=pageCount) {		//이후 5개
				buffer.append("<a href='"+myctx+"/"+loc+qStr2+"&cpage="+nextBlock+"' class='page' style='margin-left:20px;'>Next</a>");
			}
			//---html 작성 끝
			
			str= buffer.toString();
//			System.out.println(str);
			
		}
		return str;
	}
	
	
	/* getter, setter */
	public int getCpage() {
		return cpage;
	}
	public void setCpage(int cpage) {
		this.cpage = cpage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getPagingBlock() {
		return pagingBlock;
	}
	public void setPagingBlock(int pagingBlock) {
		this.pagingBlock = pagingBlock;
	}
	public int getPrevBlock() {
		return prevBlock;
	}
	public void setPrevBlock(int prevBlock) {
		this.prevBlock = prevBlock;
	}
	public int getNextBlock() {
		return nextBlock;
	}
	public void setNextBlock(int nextBlock) {
		this.nextBlock = nextBlock;
	}
	public String getSelectBox() {
		return selectBox;
	}
	public void setSelectBox(String selectBox) {
		this.selectBox = selectBox;
	}
	public String getSearchInput() {
		return searchInput;
	}
	public void setSearchInput(String searchInput) {
		this.searchInput = searchInput;
	}
	
}
