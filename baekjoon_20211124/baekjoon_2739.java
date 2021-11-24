package baekjoon_20211124;

import java.util.Scanner;

public class baekjoon_2739 {
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(A + " * "  +  i  + " = " + A * i);
		}
		
	}

}

