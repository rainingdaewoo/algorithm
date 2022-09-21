package 인프런.Two_pointers_Sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소_구하기 {
    public static int[] solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> sample = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(arr1[i] == arr2[i]){
                    sample.add(arr1[i]);
                }
            }
        }
        int[] answer = new int[sample.size()];

        for(int i = 0; i < answer.length; i++) {
            System.out.println(sample.get(i));
            answer[i] = sample.get(i);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int sort : solution(N, M, arr1, arr2)) {
            System.out.print(sort + " ");
        }
    }
}
