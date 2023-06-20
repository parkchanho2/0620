import java.util.List;
import java.util.ArrayList;

public class ListTest02 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(100);
		list.add(100.3);
		list.add("서울시");
		list.add("서울시");
		list.add(true);
		list.add('a');
		
		System.out.println("list 컬렉션 요소개수: " + list.size());
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(" " + list.get(i)); 
		}
	}
}
