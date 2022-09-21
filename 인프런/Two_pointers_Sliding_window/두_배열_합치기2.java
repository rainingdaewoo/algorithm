package 인프런.Two_pointers_Sliding_window;

import java.util.ArrayList;
import java.util.Scanner;

public class 두_배열_합치기2 {

    public static ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int point1 = 0, point2 = 0;
        while(point1 < N && point2 < M) {
            if(arr1[point1] < arr2[point2]) {
                answer.add(arr1[point1++]);
            } else {
                answer.add(arr2[point2++]);
            }
        }
        while(point1 < N){
            answer.add(arr1[point1++]);
        }
        while(point2 < M) {
            answer.add(arr2[point2++]);
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
