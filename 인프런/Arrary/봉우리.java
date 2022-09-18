package 인프런.Arrary;

import java.util.Scanner;

public class 봉우리 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    //
    public static int solution(int N, int[][] arr) {
        int answer = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny= j + dy[k];
                    if( nx >= 0 && nx < N && ny >= 0 && ny < N && arr[nx][ny] >= arr[i][j] ){
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    answer++;
                }
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
