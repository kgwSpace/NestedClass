//컴퓨터에 사운드카드가 있다.
//사운드카드에는 문자열을 읽는 기능이 있다.
//(문자열 넣어주면 콘솔화면에 출력)

interface Soundable
{
	public void sound(String a);
}

class Computer
{
	private String s;
	
	public Computer()
	{
		
	}
	
	public Computer(String s)
	{
		this.s=s;
	}
	
	//외부에서 접근할 수 있도록 interface 형으로 반환한다.
	public Soundable getSound()
	{
		
		return new Soundable()
		{
			public void sound(String a)
			{
				System.out.println(a);
			}
		};
		
	}
	
}

public class ExamComputer {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		//인터페이스 참조형은 클래스의 객체가 오는 것이 원래 정상이다.
		//근데 이건 겉으로 보기에 어떻게 만들어졌냐면
		//인터페이스 참조형이 인터페이스의 객체로 보이게끔 코딩되었다.
		Soundable s = com.getSound();
		
		s.sound("또로롱");
		
	}

}
