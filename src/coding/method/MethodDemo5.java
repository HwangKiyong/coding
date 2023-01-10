package coding.method;

public class MethodDemo5 {
	public static void numbering(int init, int limit) {
		int i = init;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(1,5);  //여러개의 인자 값을 갖게 하고 싶으면 인자값을 위와같이 배치하면 되고 매개변수 사이에 ,로 구분하면된다.
	}			
}	