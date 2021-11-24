package baekjoon_20211124;

import java.util.Scanner;

public class baekjoon_2884 {
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int Hours = in.nextInt();
		int Minute = in.nextInt();
		
		Minute -= 45;
		if (Minute < 0) {
			Minute += 60;
			Hours -= 1;			
		} 
		if(Hours < 0) {
			Hours += 24;
		}
		System.out.println(Hours + " " + Minute);
		
	}

}

