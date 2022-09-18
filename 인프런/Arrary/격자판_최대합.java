package 인프런.Arrary;

import java.util.Scanner;

public class 격자판_최대합 {
    // 각 행의 합이 있는 배열
    // 각 열의 합이 있는 배열
    // 대각선의 합이 있는 배열
    public static int solution(int N, int[][] arr) {
        int answer = 0;

        for(int i = 0; i < N; i++) {
            int sumX = 0;
            int sumY = 0;
            for(int j = 0; j < N; j++) {
                sumX += arr[i][j];
                sumY += arr[j][i];
            }
           answer = Math.max(answer, sumX);
           answer = Math.max(answer, sumY);
        }
        int sumDown = 0, sumUp = 0;
        for(int i = 0; i< N; i++) {
            sumDown += arr[i][i];
            sumUp += arr[i][N - i - 1];
        }
        answer = Math.max(answer, sumDown);
        answer = Math.max(answer, sumUp);

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
