//local class exam
//member class와 기능적으로 바뀌는 게 없다.
//클래스의 위치만 바뀜.
//xlass 클래스명 implements 인터페아스면

interface Printable2
{
	public void print();
}

class OfficeMachine2
{
	private String doc;
	
	public OfficeMachine2()
	{
		
	}
	
	public OfficeMachine2(String doc)
	{
		this.doc = doc;
	}
	
	public Printable2 getPrinter()
	{
		//Anonymous class. 익명 클래스(지역 클래스의 확장판)
		return new Printable2()
		{
			public void print()
			{
				System.out.println(doc);
			}
		};
		
	}
	
}

public class ExamLamda4 {

	public static void main(String[] args) {
		
		OfficeMachine2 om = new OfficeMachine2("제안서 서류");
		
		//프린터 클래스와 크린터 객체 둘 다 감춰져 있다.
		Printable2 prn = om.getPrinter();
		
		prn.print();
		
	}

}
