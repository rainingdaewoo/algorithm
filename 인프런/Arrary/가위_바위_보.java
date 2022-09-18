package 인프런.Arrary;

import java.util.Scanner;

public class 가위_바위_보 {
    public static char solution(int arrA, int arrB) {
        char answer = 'A';
        if(arrA == arrB) {
            return 'D';
        }
        if(arrA == 1 && arrB == 2) {
            answer = 'B';
        } else if(arrA == 2 && arrB == 3) {
            answer = 'B';
        } else if(arrA == 3 && arrB == 1) {
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
