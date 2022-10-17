package Ch10;

//'홍길동'이 '맥도날드'에서 '빅맥'을 구매한다

//객체
//홍길동(object) - 고객(Class)
//맥도날드(object) - 프렌차이즈(Class)
//
//Customer Class
//속성
// -보유금액
// -물건저장
//기능
// -구매하기(편의점)
//
//Store Class
//속성
// -보유금액
//기능
// -물건제공(고객)
//	1)돈을 받기
//	2)물건 전달 승인

class Controller
{
	MemberInfo member;
	
	void SetMember(MemberInfo member)	//MemberInfo의 것을 가져옴
	{
		this.member = member;
	}
	
	MemberInfo getMember(){
		return member;
	}

}

class MemberInfo
{
	String name;
	int age;
	String addr;
	
	public MemberInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}

public class C01ClassMethod {

	public static void main(String[] args) {
		MemberInfo obj = new MemberInfo("홍길동", 55, "대구");
		
		Controller controller = new Controller();
		controller.SetMember(obj);
		MemberInfo tmp = controller.getMember();
	}

}
