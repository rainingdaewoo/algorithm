package 인프런.SortingAndSearching;

import java.util.Scanner;

public class 중복_확인 {
    public static char solution(int N, int[] arr) {
        char answer = 'U';

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return 'D';
                }
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
        System.out.print(solution(N, arr));

    }
}
