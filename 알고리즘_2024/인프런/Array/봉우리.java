package 알고리즘_2024.인프런.Array;

import java.util.Scanner;

public class 봉우리 {
    public static int solution(int N, int[][] arr) {
        int answer = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int tmp = arr[i][j];

                if(i - 1 >= 0 && arr[i - 1][j] >= tmp) continue;
                if(i + 1 < N && arr[i + 1][j] >= tmp) continue;
                if(j - 1 >= 0 && arr[i][j - 1] >= tmp) continue;
                if(j + 1 < N && arr[i][j+1] >= tmp) continue;

                answer++;
            }
        }

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
