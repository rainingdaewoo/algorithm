package baekjoon_20211129;

import java.util.Scanner;

public class backjoon_2562 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		// int N = in.nextInt();
		//int X = in.nextInt();
		int[] A = new int[9];
		int max = 0;
		int index = 0;

		for(int i = 0; i < 9; i++) {
			A[i] = in.nextInt();
		}
		for(int i = 0; i < 9; i++) {
			if(A[i] > max) {
				max = A[i];
				index = i + 1;
			} 
		}
		System.out.println(max);
		System.out.println(index);
		
	}

}
