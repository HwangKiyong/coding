package coding.basic;

public class DivisionDemo 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=3;
		
		float c=10.0F; //F가 붙게되면 실수 float 타입의 실수이다.
		float d=3.0F;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(a/d); //정수와 실수를 나누게되면 실수가 출력된다.
	}
}
