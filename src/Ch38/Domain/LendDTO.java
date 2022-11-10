package Ch38.Domain;

public class LendDTO {
	private int Lid;
	private int bookcode;
	private String memid;
	private String startDate;
	private String endDate;
	
	//getter and setter
	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	public int getBookcode() {
		return bookcode;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	//toString() 재정의
	@Override
	public String toString() {
		return "LendDTO [Lid=" + Lid + ", bookcode=" + bookcode + ", memid=" + memid + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
	//기본 생성자
	public LendDTO(){}
	
	//모든 인자 생성자
	public LendDTO(int lid, int bookcode, String memid, String startDate, String endDate) {
		super();
		Lid = lid;
		this.bookcode = bookcode;
		this.memid = memid;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}
