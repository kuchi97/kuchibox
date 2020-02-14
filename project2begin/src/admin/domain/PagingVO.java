package admin.domain;

/* ��ſ� ���г���: ������ ����� ���غ���

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
	
	����, ��Ģ�� ã�ƺ���
	prevBlock= ((cpage-1)/pagingBlock)*pagingBlock
	nextBlock= prevBlock+(pagingBlock+1)
	
	= ��Ÿ ����¡ó�� ���ĵ�
	
	pageCount=(totalCount-1)/pageSize+1;	//������ �� ���ϴ� ����
	if(cpage<=0) {
		cpage=1;			//�������� 1���� ������ ������ 1������ ����
	}
	if(cpage>pageCount) {
		cpage=pageCount;	//������ �ִ������ ���� �Էµɶ� ������ ������������ ����
	}
*/

public class PagingVO {

	/* property */
	//����¡ ó�� ���� ������Ƽ
	private int cpage= 1;			//����������
	private int pageSize= 10;		//���������� �Խñ� ��
	private int totalCount;			//�� �Խñ�
	private int pageCount;			//������ ��
	
	//DB���� ���ڵ� ����� start, end
	private int start, end;
	
	//������ ��ó���� ������Ƽ
	private int pagingBlock= 10;		//�� ���� ������ ������ ����
	private int prevBlock;
	private int nextBlock;
	
	//�˻����� ������Ƽ
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

		//����¡ó�� ��������� �޼ҵ�
		init();
	}

	/* ����¡ ���������ϴ� �޼ҵ� */
	public void init() {
		
		pageCount= (totalCount-1)/pageSize+1;		//������ ���� ���ϴ� ����
		//�������� 0���� �۰ų� �ִ��������� �Ѿ�� ó��
		if(cpage<1) {
			cpage=1;
		}
		if(cpage>pageCount) {
			cpage=pageCount;
		}
		
		end= cpage * pageSize;
		start= end - (pageSize - 1);
		
		//�������� ���ϴ� ����
		prevBlock= ((cpage - 1) / pagingBlock) * pagingBlock;
		nextBlock= prevBlock + (pagingBlock + 1);
	}//--init();
	
	/* ������ ������̼� �ۼ��ϴ� �޼ҵ� */
	public String getPageNavi(String myctx, String loc, boolean isParam) {
		//myctx: ���ؽ�Ʈ
		//loc: ���
		//qStr: ������Ʈ��(�˻��Ҷ� �ʿ�
		
		selectBox= (selectBox==null)?"":selectBox;
		searchInput= (searchInput==null)?"":searchInput;
		
		String qStr="?selectBox="+selectBox+"&searchInput="+searchInput;
		String qStr2="&selectBox="+selectBox+"&searchInput="+searchInput;
		//String�� �Һ��������� StringBuffer �Ǵ� StringBuilder�� �̿��Ѵ�
		
		StringBuffer buffer= new StringBuffer();
		String str= null;
		//���ڿ��� ������ ����
		
		if(isParam==false) {		//������Ʈ������ �Ķ���͸� �Ѱ��ذ��� �ƴҶ�
			//html �ۼ� ����----
			if(prevBlock>0) {	//���� 5��
				buffer.append("<a href='"+myctx+"/"+loc+qStr+"&cpage="+prevBlock+"' class='page' style='margin-right:20px;'>Prev</a>");
			}
			
			for(int i=prevBlock+1; i<=nextBlock-1 && i<=pageCount; i++) {
				if(i==cpage) {
					buffer.append("<a href='#' class='page active'>"+i+"</a>");
					//���� Ȱ��ȭ�� ������. href�� ���Ƶ�
				}
				else {
					buffer.append("<a href='"+myctx+"/"+loc+qStr+"&cpage="+i+"' class='page'>"+i+"</a>");
				}
			}
			
			if(nextBlock<=pageCount) {		//���� 5��
				buffer.append("<a href='"+myctx+"/"+loc+qStr+"&cpage="+nextBlock+"' class='page' style='margin-left:20px;'>Next</a>");
			}
			//---html �ۼ� ��
			
			str= buffer.toString();
//			System.out.println(str);
			
		}
		else {
			//html �ۼ� ����----
			if(prevBlock>0) {	//���� 5��
				buffer.append("<a href='"+myctx+"/"+loc+qStr2+"&cpage="+prevBlock+"' class='page' style='margin-right:20px;'>Prev</a>");
			}
			
			for(int i=prevBlock+1; i<=nextBlock-1 && i<=pageCount; i++) {
				if(i==cpage) {
					buffer.append("<a href='#' class='page active'>"+i+"</a>");
					//���� Ȱ��ȭ�� ������. href�� ���Ƶ�
				}
				else {
					buffer.append("<a href='"+myctx+"/"+loc+qStr2+"&cpage="+i+"' class='page'>"+i+"</a>");
				}
			}
			
			if(nextBlock<=pageCount) {		//���� 5��
				buffer.append("<a href='"+myctx+"/"+loc+qStr2+"&cpage="+nextBlock+"' class='page' style='margin-left:20px;'>Next</a>");
			}
			//---html �ۼ� ��
			
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
