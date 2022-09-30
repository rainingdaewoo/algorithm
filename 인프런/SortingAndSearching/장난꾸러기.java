package 인프런.SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public static int[] solution(int N, int[] arr) {
        int[] answer = new int[2];
        int index= 0;
        int[] tmp = new int[N];
        for(int i = 0; i < N; i++){
            tmp[i] = arr[i];
        }
        Arrays.sort(tmp);
        for(int i = 0; i < N; i++) {
            if(tmp[i] != arr[i]) {
                answer[index++] = i + 1;
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
        for(int x : solution(N, arr)) {
            System.out.print(x + " ");
        }
    }
}

