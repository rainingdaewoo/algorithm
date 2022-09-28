package 인프런.SortingAndSearching;

import java.util.Scanner;

public class 선택정렬 {

    public static int[] solution(int N, int[] arr) {
        //
        int[] answer = new int[N];
        int index = 0;
        for(int i = 0; i < N; i++) {
            index = i;
            for(int j = i + 1; j < N; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            answer[i]  = temp;
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
