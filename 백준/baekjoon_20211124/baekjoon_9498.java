package 백준.baekjoon_20211124;

import java.util.Scanner;

public class baekjoon_9498 {
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();
		
		if(90 <= A && A <= 100) {
			System.out.println("A");
		} else if( 80 <= A && A < 90) {
			System.out.println("B");
		} else if( 70 <= A && A < 80) {
			System.out.println("C");
		} else if( 60 <= A && A < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}

