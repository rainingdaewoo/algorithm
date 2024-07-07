package 알고리즘_2024.인프런.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 등수구하기 {

    public static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            int count = 1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] <arr[j]) {
                    count++;
                }
            }
            answer.add(count);
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
