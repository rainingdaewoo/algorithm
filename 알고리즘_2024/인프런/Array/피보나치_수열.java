package 알고리즘_2024.인프런.Array;

import java.util.Scanner;

public class 피보나치_수열 {
    static int[] arr = new int[50];

    public static int pibonachi(int n) {
        if(n == 1 || n == 2) {
            arr[n] = 1;
            return arr[n];
        }

        arr[n] = arr[n - 1] + arr[n - 2];
        return arr[n];
    }

    public static int[] solution(int n) {
        int[] answer= new int[n];
        for(int i = 0; i < answer.length; i++) {
            answer[i] =  pibonachi(i + 1);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i : solution(n) ){
            System.out.print(i + " ");
        }

    }
}
