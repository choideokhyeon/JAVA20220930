package ChPractice;

class Userdata <I, S, D>
{
	public I UserID;
	public S UserName;
	public I UserLevel;
	public D EXP;
	
	public I getUserID() {
		return UserID;
	}
	public void setUserID(I userID) {
		UserID = userID;
	}
	public S getUserName() {
		return UserName;
	}
	public void setUserName(S userName) {
		UserName = userName;
	}
	public I getUserLevel() {
		return UserLevel;
	}
	public void setUserLevel(I userLevel) {
		UserLevel = userLevel;
	}
	public D getEXP() {
		return EXP;
	}
	public void setEXP(D eXP) {
		EXP = eXP;
	}
	@Override
	public String toString() {
		return "Userdata [UserID=" + UserID + ", UserName=" + UserName + ", UserLevel=" + UserLevel + ", EXP=" + EXP
				+ "]";
	}
	
}

public class Practice_Generic4 {

	public static void main(String[] args) {
		Userdata<Integer, String, Double> db = new Userdata<> ();
		db.setUserID(1001);
		db.setUserName("허접");
		db.setUserLevel(250);
		db.setEXP(31.41);
		System.out.println(db);
	}

}
