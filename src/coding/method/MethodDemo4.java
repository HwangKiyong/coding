package coding.method;

public class MethodDemo4 {
	public static void numbering(int limit) {
		int i = 0;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(5);  //numbering 이라는 메소드에 입력값을 주면서 출력값이 다르게 나오게된다.
	}			//index 5에 numbering(int limit) 함수를 입력하게된다
				//limit 은 5가 되는것이다.
				//int limit 과 numbering의 괄호 안에 5안에 있는것을 매개변수(parameter)라고 한다.
}				//매개변수는 입력값을 수용하기 위한 변수이다. 매개변수에 주는 값을 인자(argument)라고 한다.
