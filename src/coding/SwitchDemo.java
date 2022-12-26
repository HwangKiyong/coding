package coding;

public class SwitchDemo {

	public static void main(String[] args) {
		
		System.out.println("switch(1)");
		String s = "";
		switch(4) {
		case 1 : s = "one";	 	break;
		case 2 : s = "two";	 	break;
		case 3 : s = "three";	break;	
		default: s = "default";
		}
		System.out.println(s);
		
		int i = 3;
		if(i == 1) 	s = "one";
		else if (i == 2) s = "two";
		else s = "three";
		System.out.println(s);
	}	
}
