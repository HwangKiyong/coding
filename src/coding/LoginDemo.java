package coding;

public class LoginDemo {
	public static void main(String[] args) {
		String id = args[0]; //입력값이다.
		if(id.equals("egoing")) System.out.println("right"); //equals 는 .앞과 () 의 값이 같은지 비교하는것이다.
 		else System.out.println("wrong");
	}
}
