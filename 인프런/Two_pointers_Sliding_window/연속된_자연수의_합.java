package 인프런.Two_pointers_Sliding_window;

import java.util.Scanner;

public class 연속된_자연수의_합 {
    public static int solution(int N) {
        int answer = 0, sum = 0;
        int[] arr = new int[(N / 2) + 1];

        for(int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
        int lt = 0;
        for(int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if(sum == N) {
                answer++;
            }
            while(sum >= N) {
                sum -= arr[lt++];
                if(sum == N) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print(solution(N));
    }
}
