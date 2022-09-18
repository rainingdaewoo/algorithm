package 인프런.Arrary;

import java.util.Scanner;

public class 피보나치_수열 {
    public static int[] solution(int N) {
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            if(i < 2) {
                arr[i] = 1;
                continue;
            }
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i : solution(N)) {
            System.out.print(i + " ");
        }
    }
}
