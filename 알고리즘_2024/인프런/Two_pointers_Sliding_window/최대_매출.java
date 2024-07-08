package 알고리즘_2024.인프런.Two_pointers_Sliding_window;

import java.util.ArrayList;
import java.util.Scanner;

public class 최대_매출 {
    public static int solution(int N,int K, int[] arr1) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < K; i++) {
            sum += arr1[i];
        }
        answer = sum;
        for(int i = K; i < N; i++) {
            sum = sum + arr1[i] - arr1[i - K];
            answer = Math.max(sum, answer);
        }
        // 시간 초과
        /*for(int i = 0; i < N - K; i++) {
            int tmp = 0;
            for(int j = i; j < i + K; j++) {
                tmp += arr1[j];
            }
            answer = Math.max(answer, tmp);
        }*/

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
