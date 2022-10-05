package 인프런.SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간_정하기 {

    public static int solution(int N, int M, int[] arr) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(N, M, arr));
    }
}
