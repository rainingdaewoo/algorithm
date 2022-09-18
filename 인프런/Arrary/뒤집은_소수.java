package 인프런.Arrary;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은_소수 {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if(num == 1) {
            return false;
        }
        if(num > 2 && num % 2 == 0) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if (num % i ==0) {
                return false;
            }
        }

        return isPrime;
    }

    public static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i< N; i++) {
            int tmp = arr[i];
            int res = 0;
            while( tmp > 0) {
                res = res * 10 + tmp % 10;
                tmp /= 10;
            }
            if(isPrime(res)) {
                answer.add(res);
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
        for(int i : solution(N, arr)) {
            System.out.print(i + " ");
        }
    }
}
