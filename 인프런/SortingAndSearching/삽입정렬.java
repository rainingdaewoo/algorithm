package 인프런.SortingAndSearching;

import java.util.Scanner;

public class 삽입정렬 {
    public static int[] solution(int N, int[] arr) {
        for(int i = 1; i < N; i++) {
            int target = arr[i];
            int j = i -1;
            while(j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
        return arr;
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
