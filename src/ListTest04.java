import java.util.Enumeration;
import java.util.Vector;

// java.util 패키지의 Enumeration 인터페이스의 특징
// - 컬렉션의 저장된 복수개의 원소값을 쉽게 읽어오는 용도로 사용된다.
// - jdk1.0버전에서 추가되었기 때문에 같은 버전에서 추가된 컬렉션 클래스와 궁합이 잘 맞는다.
// - 한번 사용하면 다시 사용 못함 다시 사용하려면 재생성해서 사용해야함.
public class ListTest04 {
	public static void main(String[] args) {
		
		Vector ve = new Vector();
		for(int i = 1; i<=3; i++) {
			ve.add(new Integer(i*10));
			
		}
		Enumeration enu2 = ve.elements();
		
		while(enu2.hasMoreElements()) { //다음원소값이 있으면 참
			System.out.print(" " + enu2.nextElement()); // 다음원소값을 가져옴
		}
		System.out.println("\n======================");
		
		if(enu2.hasMoreElements()) {
			System.out.println("다음 원소값이 있다.");
		}else {
			System.out.println("한번 사용된 것은 다시 사용 못한다.");
		}
	}
}
