package coding.method;

public class MethodDemo6_return {
	public static String numbering(int init, int limit) { //String 이라는것은 numbering 이 리턴할 값이 문자열이라는걸 의미한다.
		int i = init;
		// 만들어지는 숫자들을 output 이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		String output = "";
		while(i < limit) {
			//숫자를 화면에 출력하는 대신 변수 output에 담았다.
			output += i; //옆코드는 output = output + i 라는 뜻 과 동일하다.
			i++;
		}
		//☆output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래화 같이 return 을 배치하면된다.☆
		return output;
	}
	
	public static void main(String[] args) { /* void가 메소드 앞에 붙게되면 리턴값은 존재하지 않는다 라는것이다. 
												void의 사전적 의미는 공허함,빈공간이란 뜻이다.*/
		// 메소드 numbering 이 리턴한 값이 변수 result 에 담긴다.
		String result = numbering(1,5);
		// 변수 result 값을 화면에 출력한다.
		System.out.println(result); //mail(result); file(result);
	}
}
