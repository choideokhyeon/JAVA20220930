package Ch99.Domain;

public class UserDTO extends DTO{
	private int userid;
	private String username;
	private String pwd;
	private int loginstatus;
	private int money;
	private int jewel;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(int loginstatus) {
		this.loginstatus = loginstatus;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getJewel() {
		return jewel;
	}

	public void setJewel(int jewel) {
		this.jewel = jewel;
	}

	public UserDTO(){}
		
	public UserDTO(int userid, String username, String pwd, int loginstatus, int money, int jewel) {
		super();
		this.userid = userid;
		this.username = username;
		this.pwd = pwd;
		this.loginstatus = loginstatus;
		this.money = money;
		this.jewel = jewel;
	}

	public UserDTO(String username, String pwd)
	{
		this.username = username;
		this.pwd = pwd;
	}
	
	public UserDTO(String username)
	{
		this.username = username;
	}
	

}
