// Inner class : Non-static nested class
// 1. member inner class 
// 2. local inner class
// 3. Anonymous inner class

class Outer
{
	private int num = 0;
		
	class MemberInner
	{
		
		void add(int a)
		{
			num += a;
		}
		
		int get()
		{
			return num;
		}
		
	}
	
}

public class ExamLamda2 {

	public static void main(String[] args) {
		
		Outer out1 = new Outer();
		Outer out2 = new Outer();
		
		Outer.MemberInner out1mi1 = out1.new MemberInner();
		Outer.MemberInner out1mi2 = out1.new MemberInner();
		
		Outer.MemberInner out2mi1 = out2.new MemberInner();
		Outer.MemberInner out2mi2 = out2.new MemberInner();
		
		out1mi1.add(3);
		
		System.out.println(out1mi2.get());
		
		out1mi2.add(2);
		
		System.out.println(out1mi1.get());
	}

}
