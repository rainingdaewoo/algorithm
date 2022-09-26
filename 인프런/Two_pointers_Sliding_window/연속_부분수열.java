package 인프런.Two_pointers_Sliding_window;

import java.util.Scanner;

public class 연속_부분수열 {

    public static int solution(int N, int M, int[] arr1) {
        int answer = 0;
        int lt= 0;
        int sum = 0;

        for(int rt = 0; rt < N; rt++) {
            sum += arr1[rt];
            if(sum == M) {
                answer++;
            }
            while(sum >= M) {
                sum -= arr1[lt++];
                if(sum == M) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print(solution(N , M, arr1));
    }
}
