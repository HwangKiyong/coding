package coding.basic;

public class EqualStringDemo 
{
	public static void main(String[] args)
	{
		String a="Hello World";
		String b=new String("Hello World");
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}

//문자를 비교할때는 .equals 를 써야한다.
