package 알고리즘_2024.인프런.Array;

import java.util.Scanner;

public class 소수 {

    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for(int i = 2; i < arr.length; i++) {
            if(arr[i] == 0) {
                int tmp = i;
                while(tmp <= n) {
                    arr[tmp] = 1;
                    tmp = tmp + i;
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println( solution(n) );

    }

}
