package baekjoon_20211129;

import java.util.HashSet;
import java.util.Scanner;

public class backjoon_3052 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		HashSet<Integer> count = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			count.add(in.nextInt() % 42);
		}
		
		
		
		System.out.println(count.size());
	}

}
