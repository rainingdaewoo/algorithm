package baekjoon_20111124;

import java.util.Scanner;

public class baekjoon_1330 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();
		int B = in.nextInt();
		
		if(A > B) {
			System.out.println(">");
		} else if(A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}
