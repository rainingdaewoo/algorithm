package 알고리즘_2024.인프런.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰_수_출력하기 {

    public static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] < arr[i]) answer.add( arr[i] );
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
