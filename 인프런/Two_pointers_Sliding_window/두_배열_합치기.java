package 인프런.Two_pointers_Sliding_window;

import java.util.Arrays;
import java.util.Scanner;

public class 두_배열_합치기 {
    public static int[] solution(int X, int[] arr1, int[] arr2) {
        int[] answer = new int[X];
        for(int i = 0; i < arr1.length; i++) {
            answer[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            answer[i + arr1.length] = arr2[i];
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int sort : solution(N + M, arr1, arr2)) {
            System.out.print(sort + " ");
        }
    }
}
