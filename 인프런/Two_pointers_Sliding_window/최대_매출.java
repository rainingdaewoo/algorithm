package 인프런.Two_pointers_Sliding_window;

import java.util.Arrays;
import java.util.Scanner;

public class 최대_매출 {
    // 1. 0일부터 K까지의 합을 최대 합의 초기값으로 설정
    // 2.
    public static int solution(int N, int K, int[] arr1) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < K; i++) {
            sum += arr1[i];
        }
        answer = sum;

        for(int i = K; i < arr1.length; i++) {
            sum += arr1[i] - arr1[i - K];

            if(sum > answer) {
                answer = sum;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print(solution(N , K, arr1));
    }
}
