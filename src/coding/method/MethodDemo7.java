package coding.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodDemo7 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i < limit) {
			output += i ;
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(1,5);
		System.out.println(result);
		try {	//무시
			//다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 변환한 값을 저장한다.
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));//out.txt 라는 파일을 만든다.
			out.write(result); //파일에 result 값을 기록하는 것이다.
			out.close();
		}catch(IOException e) {			
		}
	}
}
