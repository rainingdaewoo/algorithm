package 알고리즘_2024.인프런.Array;

import java.util.Scanner;

public class 보이는_학생 {

    public static int solution(int N, int[] arr) {
        int answer = 1;
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                answer++;
                max = arr[i];
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
        System.out.println( solution(N, arr) );

    }

}
