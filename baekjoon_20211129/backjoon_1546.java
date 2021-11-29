package baekjoon_20211129;

import java.util.Scanner;

public class backjoon_1546 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();		
		double [] arr = new double[N];
		double max = 0;
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i]; // 최고 점수
			}
		}
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		}
		avg = sum / N;
		System.out.println(avg);
		
	}

}
