package 알고리즘_2024.인프런.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 격자판_최대합 {
    public static int solution(int N, int[][] arr) {
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i <N; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0; j < N; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < N; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][N - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(N, arr));
    }

}
