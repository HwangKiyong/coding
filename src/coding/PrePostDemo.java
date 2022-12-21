package coding;

public class PrePostDemo
{
	public static void main(String[] args) 
	{		
		int i=3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i); //괄호 안에 더해지는것이다.
		System.out.println(i++); //++가 뒤에 붙는경우 1이 더해지긴 하나 맥락이 끝난 후 더해지는것이다.
		System.out.println(i);
	}
}

/* + 양수를 표현한다. 실제로는 사용할 필요가없다.
 - 음수를 표현한다.
 ++ 증가연산자로 항의 값을 1씩 증가한다.
 -- 감소연산자 */
