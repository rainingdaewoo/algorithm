package 알고리즘_2024.인프런.Array;

import java.util.Scanner;

public class 가위_바위_보 {

    public static char solution(int a, int b) {
        char answer = 'A';

        if( a == b) return 'D';
        if( a == 1 && b == 2) {
            answer = 'B';
        } else if( a == 2 && b == 3) {
            answer = 'B';
        } else if (a == 3 && b == 1) {
            answer = 'B';
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrA = new int[N];
        int[] arrB = new int[N];
        for(int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            arrB[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            System.out.println(solution(arrA[i], arrB[i]));
        }

    }

}
