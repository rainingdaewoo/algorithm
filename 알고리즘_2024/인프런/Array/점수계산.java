package 알고리즘_2024.인프런.Array;

import java.util.Scanner;

public class 점수계산 {

    public static int solution(int N, int[] arr) {
        int answer = 0;
        int bonus = 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer += bonus;
                bonus++;
            } else {
                bonus = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(N, arr));
    }

}
