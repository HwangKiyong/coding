package coding;

public class ElseDemo {

	public static void main(String[] args) {
		if (false) System.out.println(1);
		else if (true) System.out.println(2);  // 앞에서 true 이면 뒤에 true 더라도 실행되지 않는다.
		else if (true) System.out.println(3);
		else System.out.println(4);   //필요하지 않는다면 else 는 생략가능하다.
	}
}
