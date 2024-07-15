package 백준.baekjoon_20211129;

import java.util.Scanner;

public class backjoon_8958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int row = in.nextInt();
		String[] arr = new String[row];
		int score = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		in.close();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				score += count;
			}
			System.out.println(score);
			score = 0;
			count = 0;
		}
	}

}
