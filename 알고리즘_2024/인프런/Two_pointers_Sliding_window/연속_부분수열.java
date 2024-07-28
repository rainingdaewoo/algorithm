package 알고리즘_2024.인프런.Two_pointers_Sliding_window;

import java.util.Scanner;

public class 연속_부분수열 {
    // 다시 풀기
    public static int solution(int N, int M, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int rt = 0;

        while (rt < N) {
            if (sum == M) {
                answer++;
                rt++;
                if (rt != N) sum += arr[rt];
            } else if (sum < M) {
                rt++;
                if (rt != N) sum += arr[rt];
            } else {
                lt++;
                sum -= arr[lt];
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print(solution(N, M, arr1));
    }
}
