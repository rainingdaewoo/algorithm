package baekjoon_20211125;

import java.util.Scanner;

public class backjoon_2439 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();


		for(int i = 1; i <= A; i++) {
			for(int j = 1; j <= A - i; j++ ) {
				System.out.print(" ");
			}
			for(int k = 0; k < i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
        in.close();
		
	}

}
