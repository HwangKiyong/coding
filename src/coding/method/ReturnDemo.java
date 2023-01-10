package coding.method;


public class ReturnDemo {
	public static int one() {
		return 1; //자바는 return 을 만나는 순간에 return 뒤에 따라오는 값을 메소드 바깥족으로 반환하면서 메소드의 실행을 완전히 종료시킨다.
//		return 2; 실행되지않는다.
//		return 3; 실행되지않는다.
	}
	
	public static void main(String[] args) {
		System.out.println(one());
	}
}
