//사용자 입장에서 알아야 할 것 : OfficeMachine이 있다는 것 + Printable.
//inner class에 대해서 알 필요가 없어 사용 및 유지보수가 편하다는 장점이 있다.


interface Printable
{
	public void print();
}

class OfficeMachine 
{
	private String doc;
	
	public OfficeMachine()
	{
		
	}
	
	public OfficeMachine(String doc)
	{
		this.doc = doc;
	}
	
	public Printable getPrinter()
	{
		return new Printer();
	}
	
	//member inner class. Printer를 감추려는 의도이다.
	private class Printer implements Printable
	{
		public void print()
		{
			System.out.println(doc);
		}
	}
}

public class ExamLamda3 {

	public static void main(String[] args) {
		
		OfficeMachine om = new OfficeMachine("견적서 서류");
		
		//프린터 클래스와 크린터 객체 둘 다 감춰져 있다.
		Printable prn = om.getPrinter();
		
		prn.print();
		
	}

}
