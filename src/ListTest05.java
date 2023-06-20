import java.util.Vector;

public class ListTest05 {
	public static void main(String[] args) {
		Vector ve = new Vector();
		
		double[] arr = {38.6,9.2,42.3,6.1,4.7,1.6};
		
		for(int i = 0; i < arr.length; i++) {
			ve.add(arr[i]);
		}
		System.out.println(">> 백터전체 원소값 출력 <<");
		System.out.println("=======================");
		
		for(int i = 0; i < ve.size(); i++) {
			System.out.println(" " + ve.get(i)); //get(주소 인덱스 번호) 메서드로 컬렉션 원소값을 가져옴.
		}
		System.out.println();
		
		double findData = 6.1;
		int index = ve.indexOf(findData); // 주어진 자료에 해당하는 인덱스 주소번호 반환 . 첫주소번호는 0부터 시작
		
		if(index != -1) {
			System.out.println("\n검색 성공: " + index);
		}else {
			System.out.println("\n검색 실패: " + index);
		}
		
		double delData = 42.3;
		if(ve.contains(delData)) {
			ve.remove(delData);
			System.out.println("\n삭제완료");
		}
		System.out.println("\n>> 삭제후 벡터 원소값 출력 <<");
		System.out.println("===================================");
		
		for(int i = 0; i < ve.size(); i++) {
			System.out.print(" " + ve.get(i));
		}
		System.out.println("\n=================================");
	}
}
