package Team.Domain;

public class MemDTO extends DTO{
	private String ID;
	private String PW;
	private String Name;
	private String Addr;
	private String Phone;
	private String JoinDate;
	private int perm;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}
	public int getPerm() {
		return perm;
	}
	public void setPerm(int perm) {
		this.perm = perm;
	}
	
	public MemDTO(String id, String pw, String name, String addr, String phone, String joindate, int perm) {
		super();
		this.ID = id;
		this.PW = pw;
		this.Name = name;
		this.Addr = addr;
		this.Phone = phone;
		this.JoinDate = joindate;
		this.perm = perm;
	}
	
	MemDTO() {}
	
	@Override
	public String toString() {
		return "MemDTO [ID=" + ID + ", PW=" + PW + ", Name=" + Name + ", Addr=" + Addr + ", Phone=" + Phone
				+ ", JoinDate=" + JoinDate + ", perm=" + perm + "]";
	}
	
}
