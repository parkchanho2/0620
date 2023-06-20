import java.util.Stack;

// java.utill 패키지의 컬렉션 클래스 Stack의 특징
// - 입구와 출구가 같아서 가장 먼저 입력 된 것이 가장 나중에 나가는 구조이다. 즉 Fist Input Last OutPut 구조 (FILO구조)
// - 가장 나중에 입력된 것이 가장 먼저 나가는 구조이다. Last Input First Output구조. (LIFO구조)

public class ListTest06 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		
		myStack.push("1-java"); // 스택 맨위에 원소값을 추가
		myStack.push("2-Oracle");
		myStack.push("3-클라이언트 프로그래밍");
		
		while(!myStack.isEmpty()) {
			System.out.print(" " +  myStack.pop()); // 스택의 맨위의 원소값을 제거하면서 반환 
		}
	}
}
