package ChPractice;

class ID
{
	private String ID;
	private String PW;
	
	public ID(String ID, String PW)
	{
		super();
		this.ID = ID;
		this.PW = PW;
	}

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
	
	public String ShowInfo()
	{
		return "ID : " + ID + "\nPW : " + PW;
	}

}

public class Webgame {

	public static void main(String[] args) {

	}

}
