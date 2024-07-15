package 백준.baekjoon_20211130;

import java.util.Scanner;

public class backjoon_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int number = sc.nextInt();
		String result = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i < number; i++) {
			sum = sum + result.charAt(i) - '0';
		}
		
		System.out.println(sum);
		
	}

}
