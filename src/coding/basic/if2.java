package coding.basic;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String password = sc.nextLine();
		
		if(id.equals("egoing")) {
			if(password.equals("1111")) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}

	}

}
