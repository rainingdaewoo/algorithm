package baekjoon_20211125;

import java.util.Scanner;

public class backjoon_10871 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		int X = in.nextInt();
		int[] A = new int[N];

		for(int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		for(int i = 0; i < N; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
		
	}

}
