package 인프런.HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액의_종류 {

    //
    /* 타임 아웃     이중 for 문 X
     public static int[] solution(int N, int K, int[] arr) {
        int[] answer = new int[N - K + 1];

        for(int i = 0; i < N - K + 1; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = i; j < i + K; j++) {
                map.put(arr[j], 0);
            }
            answer[i] = map.size();
        }
        return answer;
    } */

    public static ArrayList<Integer> solution(int N, int K, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < K - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i] , 0) + 1);
        }

        int lt = 0;

        for(int rt = K - 1; rt < N; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0){
                map.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i : solution(N, K, arr)) {
            System.out.print(i + " ");
        }
    }
}
