package Ch09;

import java.util.Scanner;

class Profile
{
	private String name;
	private String addr;
	private String job;
	private String major;
	//1 디폴트 생성자 삽입
	Profile()
	{
		System.out.println("디폴트 생성자 호출");
	}
	
	
	//2 모든 인자를 받는 생성자 삽입
	public Profile(String name, String addr, String job, String major)
	{
		super();
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	
	//3 다음 생성자 안 코드 처리하기
	Profile(String all)
	{
		//->all문자열 앞뒤 공백은 제거(trim())
		//->, 단위로 잘라내기(split(","))하여 각각의 값을
		//name,addr,job,major에 저장할것(안되면 강사와 함께..배열을 사용..)
		
		all.trim();
		String arr[] = all.split(",");
		name = arr[0];
		addr = arr[1];
		job = arr[2];
		major = arr[3];
	}


	//4 toString() 재정의 코드 삽입
	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
	}

	
	//5 Getter and Setter 코드 삽입
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}
	
	
	//6 다음 메인메서드 안 코드 처리
	boolean isContain(String findstr)
	{
		//findstr 의 문자열이 멤버인 name,addr,job,major 중 하나라도 포함되면 true 리턴
		//아니면 false 리턴
		if(name.contains(findstr))
		{
			System.out.println(findstr + "은 이름에 포함되어 있습니다");
			return true;
		}
		else if(addr.contains(findstr))
		{
			System.out.println(findstr + "은 주소에 포함되어 있습니다");
			return true;
		}
		else if(job.contains(findstr))
		{
			System.out.println(findstr + "은 직업에 포함되어 있습니다");
			return true;
		}
		else if(major.contains(findstr))
		{
			System.out.println(findstr + "은 전공에 포함되어 있습니다");
			return true;
		}		
		
		else
		{
			System.out.println(findstr + "은 해당 객체에 포함되어 있지 않습니다.");
			return false;
		}
	}
	
	
	//7 다음 메인메서드 안 코드 처리
	boolean isequals(String all)
	{
		//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
		//name,addr,job,major 와 일치 하면 true
		//아니면 false 를 리턴
//		all = all.trim();
		String arr[] = all.split(",");
		if(
		(arr[0].equals(name))
		&& (arr[1].equals(addr))
		&& (arr[2].equals(job))
		&& (arr[3].equals(major)))
			return true;
		else
			return false;	
	}
}

public class C99StringClassPractice {

	public static void main(String[] args) {
		Profile hong = new Profile(" 홍길동,대구,프로그래머,컴퓨터공학 ");
		
		//멤버 내용 출력
		System.out.println(hong.toString());
		System.out.println("길동 포함 여부 : " + hong.isContain("길동"));
		System.out.println("컴퓨터 포함 여부 : " + hong.isContain("컴퓨터"));
		System.out.println("프로필 일치 여부 : "+ hong.isequals(" 홍길동,대구,프로그래머,컴퓨터공학 "));
		System.out.println("프로필 일치 여부 : "+ hong.isequals(" 홍길동,울산,프로그래머,컴퓨터공학 "));
		
		System.out.println("===========================================");
		Profile kim = new Profile("  김두한,서울,주먹패,국가유공자");
		System.out.println(kim.toString());
		System.out.println("두한 포함 여부 : " + kim.isContain("두한"));
		System.out.println("컴퓨터 포함 여부 : " + kim.isContain("컴퓨터"));
		System.out.println("프로필 일치 여부 : "+ kim.isequals("김두한,부산,주먹패,국가유공자"));
		System.out.println("프로필 일치 여부 : "+ kim.isequals("  김두한,서울,주먹패,국가유공자"));
	}

}
