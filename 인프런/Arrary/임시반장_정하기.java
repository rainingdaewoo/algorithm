package 인프런.Arrary;

import java.util.Scanner;

public class 임시반장_정하기 {

    public static int solution(int N, int[][] arr) {
        int answer = 0;

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
