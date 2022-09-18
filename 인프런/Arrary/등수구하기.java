package 인프런.Arrary;

import java.util.Scanner;

public class 등수구하기 {
    // 1. 길이가 N인 배열 생성
    // 2. 반복문을 돌면서 자신보다 큰 값이 있을 때 등수 1씩 증가
    // 3. 등수 출력
    public static int[] solution(int N, int[] arr) {
        int[] answer = new int[N];

        for(int i = 0; i < arr.length; i++) {
            int score = 1;
            for(int j = 0; j < arr.length; j ++) {
                if(arr[j] > arr[i]) {
                    score++;
                }
            }
            answer[i] =score;
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
        for(int i : solution(N, arr)) {
            System.out.print(i + " ");
        }
    }
}
