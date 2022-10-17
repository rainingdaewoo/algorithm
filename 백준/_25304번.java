package 백준;

import java.util.HashMap;
import java.util.Scanner;

public class _25304번 {

    public static String solution(int X, int N, int[][] arr) {
        int total = 0;
        for(int[] temp : arr) {
            total += temp[0] * temp[1];
        }

        return total == X ? "Yes" : "No";
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(X, N, arr));
    }
}
