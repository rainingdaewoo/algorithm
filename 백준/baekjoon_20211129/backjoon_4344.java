package 백준.baekjoon_20211129;

import java.util.Scanner;

public class backjoon_4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int C = in.nextInt();	
		for(int i = 0; i < C; i++) {
			int N = in.nextInt();
			int[] arr = new int[N];
			double sum = 0;
			double avg = 0;
			double count = 0; //��� ���� �Ѵ� �л� ��
			
			for(int j = 0; j < N; j++) {
				arr[j] = in.nextInt();
				sum += arr[j];
			}
			avg = sum / N;
			for(int j = 0; j < N; j++) {
				if(avg < arr[j]) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/N) * 100);
		}
		
	}

}
