package 인프런.SortingAndSearching;

import java.util.Scanner;

public class 버블정렬 {
    public static int[] solution(int N, int[] arr) {
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
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
