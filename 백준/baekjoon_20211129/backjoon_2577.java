package 백준.baekjoon_20211129;

import java.util.Scanner;

public class backjoon_2577 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int[] number = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String result = Integer.toString(A * B * C);
		
		 for(int i = 0; i < result.length(); i++) {
			 for(int j = 0; j < number.length; j++) {
				 if ((result.charAt(i) - '0')== j) {
					 number [j]++;
				 };
			 }
		 }
		 
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
