package 인프런.Arrary;

import java.util.Scanner;

public class 멘토링 {

    public static int solution(int[][] arr) {
        int answer = 0;
        System.out.println(arr.length);

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생 수, x축
        int M = sc.nextInt(); // 테스트 수, y축
        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr));
    }
}
