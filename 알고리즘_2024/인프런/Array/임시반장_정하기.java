package 알고리즘_2024.인프런.Array;

import java.util.Scanner;

public class 임시반장_정하기 {

    public static int solution(int N, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            int cnt = 0;

            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                for(int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                         cnt++;
                         break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][5];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(N, arr));
    }
}
