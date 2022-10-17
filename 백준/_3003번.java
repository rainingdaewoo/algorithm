package 백준;

import java.util.Scanner;

public class _3003번 {

    public static int[] solution(int[] arr) {
        int[] answer = new int[6];
        int[] template = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < arr.length; i++) {
            if(template[i] == arr[i]) answer[i] = 0;
            else if(template[i] > arr[i]) answer[i] = template[i] - arr[i];
            else answer[i] = template[i] - arr[i];
        }
        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i : solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
