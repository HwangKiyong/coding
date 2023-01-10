package coding.method;

public class MethodDemo {
	public static void numbering() {	//정의 -> {}가 시작한다.
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {	//호출 -> 뒤에 아무것도 없다.
		numbering(); //여기에 해당되는 부분이 int i =0; 부터 i++; 까지이다.
		numbering();
		numbering();
	}
}
