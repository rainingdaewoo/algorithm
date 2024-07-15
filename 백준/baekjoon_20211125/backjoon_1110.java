package 백준.baekjoon_20211125;

import java.util.Scanner;

public class backjoon_1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
		int count = 0;
		int ori_N = N; 
		while(true) {
			
			int N1 = N % 10; 
			int N10 = N / 10; 
			int sum = N10 + N1; 
			int result = (N1 * 10) + (sum % 10); 
			N = result;
			count++;
			if(ori_N == result) {
				break;
			}
		}
		System.out.println(count);
	
	}
}
