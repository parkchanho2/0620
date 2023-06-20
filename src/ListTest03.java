import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

//java.util 패키지의 컬렉션 인터페이스 Iterator 특징
// -jdk 1.2에서 추가되었기 때문에 같은 버전에서 추가된 컬렉션과 궁합이 잘 맞다. 그러므로 List컬렉션 인터페이스를 구현한
// 자손클래스 ArrayList컬렉션에 저장된 복수개의 원소값을 읽어오는 용도로 사용하면 된다.

public class ListTest03 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(100);
		list.add(200.6);
		list.add("신사임당");
		list.add(false);
		
		Iterator elements = list.iterator();
		while(elements.hasNext());{// hasNext() 메서드는 다음 원소값이 존재하면 참
			System.out.println(" " + elements.next());
		}
		System.out.println("\n======================");
		
	}
	
}
