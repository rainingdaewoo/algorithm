package 인프런.Two_pointers_Sliding_window;

import java.util.Scanner;

public class 최대_길이_연속부분수열 {
    // 반복문을 돌려서 K번 0을 1로 변환
    //

    public static int solution(int N, int K, int[] arr1) {
        int answer = 0, cnt = 0, lt = 0;




        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr1 = new int[N];

        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print(solution(N, K, arr1));
    }
}

