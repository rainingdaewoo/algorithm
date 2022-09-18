package 인프런.Arrary;

import java.util.Scanner;

public class 점수_계산 {
    public static int solution(int N, int[] arr) {
        int answer = 0;
        int score = 1;
        for(int i : arr) {
            if(i == 1) {
                answer += score;
                score++;
            } else {
                score = 1;
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
