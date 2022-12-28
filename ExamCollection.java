import java.util.*;

public class ExamCollection {
	

	public static void main(String[] args) {
		//List 생성
		
		List<String> list = new LinkedList<>();
		list.add("cherry");
		list.add("banana");
		list.add("apricot");
		list.add("durian");
		list.add("apple");
		
		//Anonymous class
		Comparator<String> f = new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
				
			}
			
		};
		
		Collections.sort(list,f);
		
		for(String s : list)
		{
			System.out.println(s.toString());
		}
	}

}
