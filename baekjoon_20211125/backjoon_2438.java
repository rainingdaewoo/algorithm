package baekjoon_20211125;

import java.util.Scanner;

public class backjoon_2438 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();


		for(int i = 1; i <= A; i++) {
			for(int j = 0; j < i; j ++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
        
		
	}

}
