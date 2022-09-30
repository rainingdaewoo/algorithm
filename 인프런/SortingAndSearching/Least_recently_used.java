package 인프런.SortingAndSearching;

import java.util.Scanner;

public class Least_recently_used {
    // 1.
    public static int[] solution(int S, int N, int[] arr) {
        int[] answer = new int[S];
        for(int x : arr) {
            int index = -1;
            for(int i = 0; i < S; i++)  {
                if(x == answer[i]) {
                    index = i;
                    break;
                }
            }
            if(index == -1) {
                for(int i = S - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            } else {
                for(int i = index; i>= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            answer[0] = x;
        }
        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // 캐시 크기
        int N = sc.nextInt(); // 작업 개수
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i : solution(S, N, arr)) {
            System.out.print(i + " ");
        }
    }
}
